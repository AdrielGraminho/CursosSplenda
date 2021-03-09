package Exer13;

import org.junit.Test;

public class Exer13 {
	
	@Test
	public void exer12_1() {
		//ponteiro funcional
		Runnable r1 = () -> System.out.println("rodando em outra thread");
		
		Runnable r2 = () -> {
			for (int i = 0; i<5; i++){
			System.out.println(i);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		Thread t2 = new Thread(r2);
		t2.start();
		
		new Thread(() -> System.out.println("outra thread")).start();
		
		}

}
