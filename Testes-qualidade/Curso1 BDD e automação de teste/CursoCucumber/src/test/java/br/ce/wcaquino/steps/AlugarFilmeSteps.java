package br.ce.wcaquino.steps;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import br.ce.wcaquino.Utils.DateUtils;
import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.NotaAluguel;
import br.ce.wcaquino.serviços.AluguelService;
import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class AlugarFilmeSteps {

	private Filme filme;
	private AluguelService aluguel = new AluguelService();
	private NotaAluguel nota;
	private String erro;
	private String tipoAluguel;

	@Dado("^um filme com estoque de (\\d+) unidades$")
	public void umFilmeComEstoqueDeUnidades(int arg1) throws Throwable {
		filme = new Filme();
		filme.setEstoque(arg1);
	}

	@Dado("^que o preço do aluguel seja R\\$(\\d+)$")
	public void queOPreçoDoAluguelSejaR$(int arg1) throws Throwable {
		filme.setAluguel(arg1);
	}

	@Quando("^alugar$")
	public void alugar() throws Throwable {
		try {
			nota = aluguel.alugar(filme, tipoAluguel);
		} catch (RuntimeException e) {
			erro = e.getMessage();
		}

	}

	@Então("^o preço so aluguel será R\\$(\\d+)$")
	public void oPreçoSoAluguelSeráR$(int arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPreco());
	}

	@Então("^o estoque do filme será (\\d+) unidade$")
	public void oEstoqueDoFilmeSeráUnidade(int arg1) throws Throwable {
		Assert.assertEquals(arg1, filme.getEstoque());
	}

	@Então("^não será possível por falta de estoque$")
	public void nãoSeráPossívelPorFaltaDeEstoque() throws Throwable {
		Assert.assertEquals("Filme sem estoque", erro);
	}

	@Dado("^que o tipo de alguel seja extendido$")
	public void queOTipoDeAlguelSejaExtendido() throws Throwable {
		tipoAluguel = "extendido";
	}

	@Então("^a data de entrega será em (\\d+) dias?$")
	public void aDataDeEntregaSeráDemDias(int arg1) throws Throwable {
		Date dataEsperada = DateUtils.obterDataDiferencialDias(arg1);
		Date dataReal = nota.getDataEntrega();
		
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		Assert.assertEquals(format.format(dataEsperada), format.format(dataReal));
		
	}

	@Então("^a pontuação será de (\\d+) pontos$")
	public void aPontuaçãoSeráDePontos(int arg1) throws Throwable {
		Assert.assertEquals(arg1, nota.getPontuacao());
	}
}
