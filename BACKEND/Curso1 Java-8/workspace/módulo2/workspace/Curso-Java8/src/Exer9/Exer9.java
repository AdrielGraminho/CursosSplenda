package Exer9;

import org.junit.Test;

import Exer8.Forno;

public class Exer9 {

	@Test
	public void exer9() {
	Forno forno = new Forno();
	forno.assar(() -> System.out.println("Pizza lambda"));
	forno.assar(() ->{
		System.out.println("molho");
		System.out.println("queijo");
		System.out.println("azeitona");
	});

	}
}
