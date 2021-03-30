package Exer11;

import org.junit.Test;

import Exer10.Matematica;

public class Exer11 {
	
	public void calcular(Matematica m){
		System.out.println(m.operar(10, 10));
	}
	
	@Test
	public void exer11(){
	calcular((v1, v2) -> {
		return v1 + v2;	
	});	
	
	calcular((v1, v2) -> {
		System.out.println("corpo do lambda");
		return v1 - v2;
	});

	}
}
