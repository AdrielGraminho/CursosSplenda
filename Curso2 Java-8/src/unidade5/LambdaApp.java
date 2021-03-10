package unidade5;

import java.util.Arrays;
import java.util.List;

public class LambdaApp {

	static int numero = 10;
	int somatorio;

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(1, 2, 3, 4);

		LambdaApp app = new LambdaApp();

		/*
		 * for(Integer inteiro:integers) { inteiro = inteiro + 10;
		 * System.out.println(inteiro); }
		 */

		integers.forEach((Integer x) -> {
			x = x + numero;
			app.somatorio = app.somatorio + x;
			System.out.println(x);
		});
		System.out.println(app.somatorio);
	}


}
