package br.ce.wcaquino.servicos;

import org.junit.Test;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZeroException;

import org.junit.Assert;
import org.junit.Before;

public class CalculadoraTest {

	private Calculadora calc;
	
	@Before
	public void setup() {
		calc = new Calculadora();
	}

	
	@Test
	public void deveSomarDoisValores() {
		// cenário
		int a = 5;
		int b = 3;

		// ação
		int resultado = calc.somar(a, b);

		// verificação
		Assert.assertEquals(8, resultado);

	}

	@Test
	public void deveSubtrairDoisValores() {
		// cenário
		int a = 5;
		int b = 3;

		// ação
		int resultado = calc.subtrair(a, b);

		// verificação
		Assert.assertEquals(2, resultado);

	}
	@Test
	public void deveMultiplicarDoisValores() {
		// cenário
		int a = 5;
		int b = 3;

		// ação
		int resultado = calc.multiplicar(a, b);

		// verificação
		Assert.assertEquals(15, resultado);
	}

	public void deveDividirDoisValores() throws NaoPodeDividirPorZeroException {
		// cenário
		double a = 5;
		double b = 3;

		// ação
		double resultado = calc.dividir(a, b);

		// verificação
		Assert.assertEquals(1.66, resultado, 0.1);
	}
	
	@Test(expected = NaoPodeDividirPorZeroException.class)
	public void deveLancarExcesaoAoDividirPorZero() throws NaoPodeDividirPorZeroException {
		// cenário
		double a = 5;
		double b = 0;

		// ação
		double resultado = calc.dividir(a, b);

		// verificação
	}
}
