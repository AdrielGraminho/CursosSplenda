package unidade6;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class JTFApp extends JFrame implements ActionListener {

	public static void main(String[] args) {
		
		JTFApp frame = new JTFApp();
		frame.setTitle("Primeira Aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		JTextField tf = new JTextField("Digite aqui");
		tf.addActionListener(frame);
		cont.add(tf,BorderLayout.NORTH);
		frame.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		JOptionPane.showMessageDialog(null, ev.getActionCommand().toString());
	}

}
