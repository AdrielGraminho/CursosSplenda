package unidade3;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class AcessBD {

	static String url = "jdbc:oracle:thin:@localhost:49161:XE";
	static String usuario = "system";
	static String senha = "oracle";
	static Connection conexao;

	
	public static void conectar() throws SQLException {
		conexao = DriverManager.getConnection(url,usuario,senha);
		conexao.setAutoCommit(false);
	}
	
	public static void consultarCliente() throws SQLException {
		String consulta = "SELECT * FROM CLIENTE";
		Statement statement = conexao.createStatement();
		ResultSet rs = statement.executeQuery(consulta);
		while(rs.next()) {
			JOptionPane.showMessageDialog(null, "cpf:" + rs.getInt(1) +
					" nome: " + rs.getString(2)+ " email: " + rs.getString(3) );

		}
	}
	
	public static void mostrarMetaInfoBD() throws SQLException {
		DatabaseMetaData meta = conexao.getMetaData();
		String fabricantBd = meta.getDatabaseProductName();
		String versaoBD = meta.getDatabaseProductVersion();
		JOptionPane.showMessageDialog(null, fabricantBd + "<==>" +versaoBD);
		
	}
	
	public static void main(String[] args) throws SQLException {
		conectar();
		mostrarMetaInfoBD();
		consultarCliente();
		conexao.close();
	}

}
