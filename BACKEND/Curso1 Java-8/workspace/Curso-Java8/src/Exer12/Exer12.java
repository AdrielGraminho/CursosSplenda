package Exer12;

import org.junit.Test;

import Exer10.Matematica;

public class Exer12 {

	public void calcular(Matematica m) {
		System.out.println(m.operar(10, 10));
	}

	@Test
	public void exer12(){
		calcular((Integer v1, Integer v2) -> {
			return v1 / v2;
		});
		
		calcular((Integer v1, Integer v2) -> {
			System.out.println("Corpo de lambda");
			return v1 / v2;
		});
		
		calcular((Integer v1, Integer v2) -> v1 * v2);
	}
}
