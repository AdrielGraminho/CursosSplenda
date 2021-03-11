package unidade6;

import javax.swing.JOptionPane;

public class DialogApp {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Iniciando a aplicação...", "Instalação concluída", JOptionPane.INFORMATION_MESSAGE);
		String nome = JOptionPane.showInputDialog("Digite seu nome");
		int resposta = JOptionPane.showConfirmDialog(null, "O nome " +nome+ " foi informado. Salvar as alterações?");
		JOptionPane.showMessageDialog(null, "" +resposta);

	}

}
