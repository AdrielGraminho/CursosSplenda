package br.ce.wcaquino.servicos;

import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.exceptions.FilmeSemEstoqueException;
import br.ce.wcaquino.exceptions.LocadoraException;
import br.ce.wcaquino.servicos.LocacaoService;
import br.ce.wcaquino.utils.DataUtils;

public class LocacaoServiceTest {

	private LocacaoService service;

	@Rule
	public ErrorCollector error = new ErrorCollector();

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Before
	public void setup() {
		service = new LocacaoService();

	}

	@Test
	public void deveAlugarFilmeComSucesso() throws Exception {
		// cenário

		Usuario usuario = new Usuario("Usuário 1");
		List<Filme> filmes = Arrays.asList(new Filme("Filme1", 10, 15.50));

		// ação
		Locacao locacao;
		locacao = service.alugarFilme(usuario, filmes);

		// verificação
		Assert.assertEquals(15.50, locacao.getValor(), 0.01);
		error.checkThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.equalTo(15.50)));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()), CoreMatchers.is(true));
		error.checkThat(DataUtils.isMesmaData(locacao.getDataRetorno(), DataUtils.obterDataComDiferencaDias(1)),
				CoreMatchers.is(true));

		// assertThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.equalTo(15.50)));
		// assertThat(DataUtils.isMesmaData(locacao.getDataLocacao(), new Date()),
		// CoreMatchers.is(true));
		// assertThat(DataUtils.isMesmaData(locacao.getDataRetorno(),
		// DataUtils.obterDataComDiferencaDias(1)), CoreMatchers.is(true));

		// Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataLocacao(), new
		// Date()));
		// Assert.assertTrue(DataUtils.isMesmaData(locacao.getDataRetorno(),
		// DataUtils.obterDataComDiferencaDias(1)));

	}

	@Test(expected = FilmeSemEstoqueException.class)
	public void deveLancarExcecaoAoAlugarFilmeSemEstoque() throws Exception {
		// cenário
		Usuario usuario = new Usuario("Usuário 1");

		List<Filme> filmes = Arrays.asList(new Filme("Filme1", 0, 15.50));

		// ação
		service.alugarFilme(usuario, filmes);
	}

//	@Test
//	public void testLocacao_filmeSemEstoque2() {
//		// cenário
//		LocacaoService service = new LocacaoService();
//		Usuario usuario = new Usuario("Usuário 1");
//		Filme filme = new Filme("A volta dos que não foram", 0, 15.50);
//		// ação
//		Locacao locacao;
//
//		try {
//			service.alugarFilme(usuario, filme);
//			Assert.fail("Deveria ter lancado uma excessao");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			assertThat(e.getMessage(), CoreMatchers.is("Filme sem estoque"));
//			;
//		}
//	}
//
//	@Test
//	public void testLocacao_filmeSemEstoque_3() throws Exception {
//		// cenário
//		LocacaoService service = new LocacaoService();
//		Usuario usuario = new Usuario("Usuário 1");
//		Filme filme = new Filme("A volta dos que não foram", 0, 15.50);
//		Locacao locacao;
//
//		exception.expect(Exception.class);
//		exception.expectMessage("Filme sem estoque");
//
//		// ação
//		service.alugarFilme(usuario, filme);
//
//	}

	@Test
	public void deveLancarExcecaoAoNaoInformarUsuario() throws FilmeSemEstoqueException {
		// cenario
		List<Filme> filmes = Arrays.asList(new Filme("Filme1", 1, 15.50));

		// acao
		try {
			service.alugarFilme(null, filmes);
			Assert.fail();
		} catch (LocadoraException e) {
			assertThat(e.getMessage(), CoreMatchers.is("Usuário vazio"));
		}

	}

	@Test
	public void deveLancarExcecaoAoNaoInformarFilme() throws FilmeSemEstoqueException, LocadoraException {
		// cenário
		Usuario usuario = new Usuario("Usuário 1");

		exception.expect(LocadoraException.class);
		exception.expectMessage("Filme vazio");

		// acao
		service.alugarFilme(usuario, null);

	}

	@Test
	public void devePagar75PctopNoFilme3() throws FilmeSemEstoqueException, LocadoraException {

		// cenario
		Usuario usuario = new Usuario("Usuário 1");
		List<Filme> filmes = Arrays.asList(new Filme("Filme1", 2, 4.0), new Filme("Filme2", 2, 4.0),
				new Filme("Filme3", 2, 4.0));

		// acao

		Locacao resultado = service.alugarFilme(usuario, filmes);

		// verificacao
		// 4+4+3=11

		assertThat(resultado.getValor(), CoreMatchers.is(11.0));
	}

	@Test
	public void devePagar50PctopNoFilme4() throws FilmeSemEstoqueException, LocadoraException {

		// cenario
		Usuario usuario = new Usuario("Usuário 1");
		List<Filme> filmes = Arrays.asList(new Filme("Filme1", 2, 4.0), new Filme("Filme2", 2, 4.0),
				new Filme("Filme3", 2, 4.0), new Filme("Filme2", 2, 4.0));

		// acao

		Locacao resultado = service.alugarFilme(usuario, filmes);

		// verificacao
		// 4+4+3+2=13

		assertThat(resultado.getValor(), CoreMatchers.is(13.0));
	}

	@Test
	public void devePagar25PctopNoFilme5() throws FilmeSemEstoqueException, LocadoraException {

		// cenario
		Usuario usuario = new Usuario("Usuário 1");
		List<Filme> filmes = Arrays.asList(new Filme("Filme1", 2, 4.0), new Filme("Filme2", 2, 4.0),
				new Filme("Filme3", 2, 4.0), new Filme("Filme4", 2, 4.0), new Filme("Filme5", 2, 4.0));

		// acao

		Locacao resultado = service.alugarFilme(usuario, filmes);

		// verificacao
		// 4+4+3+2+1=14

		assertThat(resultado.getValor(), CoreMatchers.is(14.0));
	}

	@Test
	public void devePagar0PctopNoFilme6() throws FilmeSemEstoqueException, LocadoraException {

		// cenario
		Usuario usuario = new Usuario("Usuário 1");
		List<Filme> filmes = Arrays.asList(new Filme("Filme1", 2, 4.0), new Filme("Filme2", 2, 4.0),
				new Filme("Filme3", 2, 4.0), new Filme("Filme4", 2, 4.0), new Filme("Filme5", 2, 4.0),
				new Filme("Filme6", 2, 4.0));

		// acao

		Locacao resultado = service.alugarFilme(usuario, filmes);

		// verificacao
		// 4+4+3+2+1+0=14

		assertThat(resultado.getValor(), CoreMatchers.is(14.0));
	}
}
