package br.example.model.veiculo;

public class TesteVeiculo {
	
	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		veiculo.setTipoOperacao(Integer.valueOf(TipoOperacao.VENDA_CONCECIONARIA.getDescricao()));
		veiculo.setChassi("11111111111111111");
		veiculo.setCodigoCor("02618"); ///QUEM VAI PREENCHER A COR??
		veiculo.setDescricaoCor("BRANCO MAHLER LISA");
		veiculo.setPotenciaMotor(60);
		veiculo.setCilindradas(1000);
		veiculo.setPesoLiquido(600.0000);
		veiculo.setPesoBruto(500.0000);
		veiculo.setNumeroSerie("124545");
		veiculo.setTipoCombustivel(Integer.valueOf(TipoCombustivel.ALCOOL.getDescricao()));
		veiculo.setNumeroMotor("UD12455");
		veiculo.setCapacidadeTracao(300.0000);
		veiculo.setDistanciaEixos("1.20");
		veiculo.setAnoModelo(2004);
		veiculo.setAnoFabricacao(2004);
		veiculo.setTipoPintura("METÁLICA");
		veiculo.setTipo(Tipo.AUTOMÓVEL);
		veiculo.setEspecie(Integer.valueOf(Especie.CARGA.getDescricao()));
		veiculo.setCondicaoVin(CondicaoVin.N.name());
		veiculo.setCondicao(Integer.valueOf(Condicao.Acabado.getDescricao()));
		veiculo.setCodigoModelo("123"); //Utilizar a tabela renavam
		veiculo.setCodigoCorDenatran(Integer.valueOf(CodigoCorDenatran.BRANCA.getDescricao()));
		veiculo.setLotacaoMaxima(5);
		veiculo.setRestricao(Integer.valueOf(Restricao.Não_há.getDescricao()));
		
		System.out.println(veiculo.getRestricao());
		
		
	}

}
