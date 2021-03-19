package br.ce.wcaquino.servicos;

import static br.ce.wcaquino.builders.UsuarioBuilder.umUsuario;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;
import org.junit.rules.ExpectedException;

import br.ce.wcaquino.builders.FilmeBuilder;
import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.Locacao;
import br.ce.wcaquino.entidades.Usuario;
import br.ce.wcaquino.exceptions.FilmeSemEstoqueException;
import br.ce.wcaquino.exceptions.LocadoraException;
import br.ce.wcaquino.matchers.MatchersProprios;
import br.ce.wcaquino.utils.DataUtils;
import buildermaster.BuilderMaster;

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
		Assume.assumeFalse(DataUtils.verificarDiaSemana(new Date(), Calendar.SATURDAY));

		// cenário

		Usuario usuario = umUsuario().agora();
		List<Filme> filmes = Arrays.asList(FilmeBuilder.umFilme().agora());

		// ação
		Locacao locacao = service.alugarFilme(usuario, filmes);

		// verificação
		Assert.assertEquals(4.0, locacao.getValor(), 0.01);
		error.checkThat(locacao.getValor(), CoreMatchers.is(CoreMatchers.equalTo(4.0)));
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
		Usuario usuario = umUsuario().agora();

		List<Filme> filmes = Arrays.asList(FilmeBuilder.umFilme().semEstoque().agora());

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
		List<Filme> filmes = Arrays.asList(FilmeBuilder.umFilme().agora());

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
		Usuario usuario = umUsuario().agora();

		exception.expect(LocadoraException.class);
		exception.expectMessage("Filme vazio");

		// acao
		service.alugarFilme(usuario, null);

	}

	@Test
	public void deveDevolverNaSegundaAoAlugarSábado() throws FilmeSemEstoqueException, LocadoraException {
		Assume.assumeTrue(DataUtils.verificarDiaSemana(new Date(), Calendar.SATURDAY));
		// cenario

		Usuario usuario = umUsuario().agora();
		List<Filme> filmes = Arrays.asList(FilmeBuilder.umFilme().agora());

		// ação
		Locacao retorno = service.alugarFilme(usuario, filmes);

		// verificação
		//assertThat(retorno.getDataRetorno(), new DiaSemanaMatcher(Calendar.MONDAY));
		assertThat(retorno.getDataRetorno(),MatchersProprios.caiEm(Calendar.MONDAY));
		assertThat(retorno.getDataRetorno(),MatchersProprios.caiNumaSegunda());

	}
	
	public static void main(String[] args) {
		new BuilderMaster().gerarCodigoClasse(Locacao.class);
	}

}
