package unidade3;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ClientApp {

	static String url = "jdbc:oracle:thin:@localhost:49161:XE";
	static String usuario = "system";
	static String senha = "oracle";
	static Connection conexao;

	public static void conectar() throws SQLException {
		conexao = DriverManager.getConnection(url, usuario, senha);
		conexao.setAutoCommit(false);
	}

	public static void desconectar() throws SQLException {
		conexao.close();
	}

	public static void inserir(long cpf, String nome, String email) throws SQLException {
		String sql = "insert into Cliente values ("+cpf+",'"+nome+"','"+email+"')";
		Statement statment = conexao.createStatement();
		statment.execute(sql);
		conexao.commit();

	}
	
	public static void inserirPS(long cpf, String nome, String email) throws SQLException {
		String sql = "insert into Cliente values(?,?,?)";
		
		PreparedStatement statment = conexao.prepareStatement(sql);
		statment.setLong(1, cpf);
		statment.setString(2, nome);
		statment.setString(3, email);

		statment.executeUpdate();
		conexao.commit();

	}
	
	public static void inserirSP(long cpf, String nome, String email) throws SQLException {
		String sql = "{call sp_inserircliente(?,?,?)}";
		CallableStatement cstmt = conexao.prepareCall(sql);
		cstmt.setLong(1, cpf);
		cstmt.setString(2, nome);
		cstmt.setString(3, email);

		cstmt.execute();
		conexao.commit();

	}
	

	public static void consultar(long cpf) throws SQLException {

		String sql = "select * from cliente where cpf=" + cpf + "";
		Statement statment = conexao.createStatement();
		statment.execute(sql);
		ResultSet rs = statment.executeQuery(sql);

		while (rs.next()) {
			System.out.println("cpf:" + rs.getInt(1) + " nome: " + rs.getString(2) + " email: " + rs.getString(3));

		}

	}

	public static void consultarTodos() throws SQLException {

		String sql = "select * from cliente";
		Statement statment = conexao.createStatement();
		statment.execute(sql);
		ResultSet rs = statment.executeQuery(sql);
		int contador = rs.getRow();

		while (rs.next()) {
			System.out.println("cpf:" + rs.getInt(1) + " nome: " + rs.getString(2) + " email: " + rs.getString(3));
			contador++;
			System.out.println("===================================");
		}

		System.out.println("N??mero de clientes listados: " + contador);

	}

	public static void alterar(long cpf, String nome, String email) throws SQLException {
		String sql = "update Cliente set nome='"+nome+"',email='"+email+"' where cpf="+cpf;
		Statement statment = conexao.createStatement();
		statment.executeUpdate(sql);
		conexao.commit();
	}

	public static void excluir(long cpf) throws SQLException {
		String sql = "delete from Cliente where cpf=" + cpf;
		Statement statment = conexao.createStatement();
		statment.executeUpdate(sql);
		conexao.commit();

	}

	public static void main(String[] args) throws SQLException {
		try {
			
		
		conectar();
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		long cpf;
		String nome, email;

		while (opcao != 6) {
			System.out.println("Sistema de Gerenciamento de Clientes");
			System.out.println("====================================");
			System.out.println("Digite [1] para Consultar todos clientes");
			System.out.println("Digite [2] para Consultar um Cliente espec??fico");
			System.out.println("Digite [3] para Cadastrar um novo cliente");
			System.out.println("Digite [4] para Alterar um cliente");
			System.out.println("Digite [5] para Excluir um cliente");
			System.out.println("Digite [6] para Sair");

			opcao = entrada.nextInt();
			switch (opcao) {
			case 1: {//consultar todos
				System.out.println("[1] Consultar todos");
				consultarTodos();
				break;
			}
			case 2: {//consultar
				System.out.println("[2] Consultar um Espec??fico");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();
				consultar(cpf);
				break;
			}
			case 3: {//cadastrar cliente
				System.out.println("[3] Cadastrar um novo cliente");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar o nome");
				nome = entrada.nextLine();
				System.out.println("Favor informar o email");
				email = entrada.nextLine();
				//inserir(cpf, nome, email);
				//inserirPS(cpf, nome, email);
				inserirSP(cpf, nome, email);
				break;
			}
			case 4: {
				System.out.println("[4] Alterar um cliente");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();
				entrada.nextLine();
				System.out.println("Favor informar o nome");
				nome = entrada.nextLine();
				System.out.println("Favor informar o email");
				email = entrada.nextLine();
				alterar(cpf, nome, email);
				break;
			}
			case 5: {
				System.out.println("[5] Exluir um cliente");
				System.out.println("Favor informar o cpf");
				cpf = entrada.nextLong();	
				excluir(cpf);
				break;
			}
			case 6: { //sair
				System.out.println("Encerrando o sistema...");
				break;
			}
			}

		}
		}catch (Exception e) {

			e.printStackTrace();
		}
	}

}
