package br.ce.wcaquino.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.ce.wcaquino.servicos.CalculadoraTest;
import br.ce.wcaquino.servicos.CalculoValorFuncaoTest;
import br.ce.wcaquino.servicos.LocacaoServiceTest;

//@RunWith(Suite.class)
@SuiteClasses({
	CalculadoraTest.class,
	CalculoValorFuncaoTest.class,
	LocacaoServiceTest.class
})
public class SuiteExecucao {
	//remover se puders
	//posso botar befores e afters
	
}
