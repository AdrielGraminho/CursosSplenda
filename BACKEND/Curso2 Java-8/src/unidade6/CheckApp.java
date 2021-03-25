package unidade6;

import java.awt.*;
import javax.swing.*;

public class CheckApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Primeira aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(new JCheckBox("1-Sim"));
		cont.add(new JCheckBox("1-Não"));
		frame
		.setVisible(true);
		
	}

}
