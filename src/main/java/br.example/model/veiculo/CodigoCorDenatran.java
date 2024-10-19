package br.example.model.veiculo;

public enum CodigoCorDenatran {
	AMARELO("01"),
	AZUL("02"),
	BEGE("03"),
	BRANCA("04"),
	CINZA("05"),
	DOURADA("06"),
	GRENÁ("07"),
	LARANJA("08"),
	MARRON("09"),
	PRATA("10"),
	PRETA("11"),
	ROSA("12"),
	ROXA("13"),
	VERDE("14"),
	VERMELHA("15"),
	FANTASIA("16");
	private String descricao;

	private CodigoCorDenatran(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	

}
