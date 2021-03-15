package unidade3.com.abctreinamentos;

import java.util.List;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.Scanner;

public class ClienteDAO {
	static String url = "jdbc:oracle:thin:@localhost:49161:XE";
	static String usuario = "system";
	static String senha = "oracle";
	static Connection conexao;

	public static void conectar() throws SQLException {
		conexao = DriverManager.getConnection(url, usuario, senha);
		DatabaseMetaData meta = conexao.getMetaData();
		conexao.setAutoCommit(false);
		System.out.println("Conectado ao banco de dados " + meta.getDatabaseProductVersion());
	}

	public static void desconectar() throws SQLException {
		conexao.close();
	}

	public static void inserir(Cliente cliente) throws SQLException {
		String sql = "insert into Cliente values (" + cliente.getCpf() + ",'" + cliente.getNome() + "','"
				+ cliente.getEmail() + "')";
		Statement statment = conexao.createStatement();
		statment.execute(sql);
		conexao.commit();

	}

	public static Cliente consultar(long cpf) throws SQLException {

		String sql = "select * from cliente where cpf=" + cpf + "";
		Statement statment = conexao.createStatement();
		ResultSet rs = statment.executeQuery(sql);
		Cliente cliente = null;

		while (rs.next()) {
			cliente = new Cliente(rs.getLong(1), rs.getString(2), rs.getString(3));

		}

		return cliente;

	}

	public static List<Cliente> consultarTodos() throws SQLException {

		String sql = "select * from cliente";
		Statement statment = conexao.createStatement();
		statment.execute(sql);
		ResultSet rs = statment.executeQuery(sql);

		List<Cliente> clientes = new LinkedList<>();

		while (rs.next()) {
			Cliente cliente = new Cliente(rs.getLong(1), rs.getString(2), rs.getString(3));
			clientes.add(cliente);
		}

		return clientes;
	}

	public static void alterar(Cliente cliente) throws SQLException {
		String sql = "update Cliente set nome='" + cliente.getNome() + "',email='" + cliente.getEmail() + "' where cpf="
				+ cliente.getCpf();
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
				System.out.println("Digite [2] para Consultar um Cliente específico");
				System.out.println("Digite [3] para Cadastrar um novo cliente");
				System.out.println("Digite [4] para Alterar um cliente");
				System.out.println("Digite [5] para Excluir um cliente");
				System.out.println("Digite [6] para Sair");

				opcao = entrada.nextInt();
				switch (opcao) {
				case 1: {// consultar todos
					System.out.println("[1] Consultar todos");
					List<Cliente> clientes = ClienteDAO.consultarTodos();
					clientes.forEach(System.out::println);
					System.out.println("Número de Clientes >>>>>" + clientes.size() + "\n");
					break;
				}
				case 2: {// consultar
					System.out.println("[2] Consultar um Específico");
					System.out.println("Favor informar o cpf");
					cpf = entrada.nextLong();
					Cliente cliente = ClienteDAO.consultar(cpf);
					System.out.println(cliente);
					break;
				}
				case 3: {// cadastrar cliente
					System.out.println("[3] Cadastrar um novo cliente");
					System.out.println("Favor informar o cpf");
					cpf = entrada.nextLong();
					entrada.nextLine();
					System.out.println("Favor informar o nome");
					nome = entrada.nextLine();
					System.out.println("Favor informar o email");
					email = entrada.nextLine();
					Cliente cliente = new Cliente(cpf, nome, email);
					ClienteDAO.alterar(cliente);
					// inserir(cpf, nome, email);
					// inserirPS(cpf, nome, email);
					// inserirSP(cpf, nome, email);
					break;
				}
				case 4: {//Alterar
					System.out.println("[4] Alterar um cliente");
					System.out.println("Favor informar o cpf");
					cpf = entrada.nextLong();
					entrada.nextLine();
					System.out.println("Favor informar o nome");
					nome = entrada.nextLine();
					System.out.println("Favor informar o email");
					email = entrada.nextLine();
					Cliente cliente = new Cliente(cpf, nome, email);
					ClienteDAO.alterar(cliente);
					break;
				}
				case 5: {
					System.out.println("[5] Exluir um cliente");
					System.out.println("Favor informar o cpf");
					cpf = entrada.nextLong();
					ClienteDAO.excluir(cpf);
					break;
				}
				case 6: { // sair
					System.out.println("Encerrando o sistema...");
					break;
				}
				}

			}
			entrada.close();
			desconectar();
		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
