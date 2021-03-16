package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class JPFApp {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Primeira aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		JPasswordField pf = new JPasswordField("Digite aqui");
		cont.add(pf,BorderLayout.NORTH);
		frame.setVisible(true);
		
	}

}
