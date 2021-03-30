package unidade1;

import java.util.Scanner;

public class Calculadora {
	public static void dividir(int n1, int n2) throws ArithmeticException {
		System.out.println(n1 / n2);
	}

	public static void main(String[] args) throws DivisaoZeroException {

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o primeiro valor");
		int n1 = entrada.nextInt();
		System.out.println("digite o segundo valor");
		int n2 = entrada.nextInt();
		try {
		dividir(n1, n2);
		}catch (Exception e) {
			throw new DivisaoZeroException();
		}
	}

}
