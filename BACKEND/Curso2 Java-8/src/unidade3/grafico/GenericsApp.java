package unidade3.grafico;

import java.awt.List;
import java.util.ArrayList;

public class GenericsApp {

	public static void main(String[] args) {
		
		List<Shape> lista = new ArrayList<>();
		lista.add(new Circle());
		lista.add(new Rectangle());
	}

}
