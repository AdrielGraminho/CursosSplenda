package br.ce.wcaquino.serviços;

import br.ce.wcaquino.Utils.DateUtils;
import br.ce.wcaquino.entidades.Filme;
import br.ce.wcaquino.entidades.NotaAluguel;
import br.ce.wcaquino.entidades.TipoAluguel;

public class AluguelService {

	public NotaAluguel alugar(Filme filme, TipoAluguel tipoAluguel  ) {

		if (filme.getEstoque() == 0) {
			throw new RuntimeException("Filme sem estoque");
		}
		NotaAluguel nota = new NotaAluguel();
		
		switch (tipoAluguel) {
		case COMUM:
			
			nota.setPreco(filme.getAluguel());
			nota.setDataEntrega(DateUtils.obterDataDiferencialDias(1));
			nota.setPontuacao(1);
			break;
		
		case EXTENDIDO:
			
			nota.setPreco(filme.getAluguel() * 2);
			nota.setDataEntrega(DateUtils.obterDataDiferencialDias(3));
			nota.setPontuacao(2);
			break;
		case SEMANAL:
			
			nota.setPreco(filme.getAluguel() * 3);
			nota.setDataEntrega(DateUtils.obterDataDiferencialDias(7));
			nota.setPontuacao(3);
			break;

		}
		

		filme.setEstoque(filme.getEstoque() - 1);
		return nota;

	}

}
