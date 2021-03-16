package unidade6;

import java.awt.*;
import javax.swing.*;

public class ComboBoxApp {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Primeira aplicação");
		frame.setSize(350,250);
		Container cont = frame.getContentPane();
		cont.setLayout(new FlowLayout());
		String[] init = {"Brasil", "Portugal", "EUA" };
		JComboBox<String> combo = new JComboBox<String>(init);
		cont.add(combo);
		
		
		frame.setVisible(true);
		
	}

}
