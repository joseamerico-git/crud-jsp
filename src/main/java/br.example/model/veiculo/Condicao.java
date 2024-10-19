package br.example.model.veiculo;

public enum Condicao {
	Acabado("1"),
	Inacabado("2"),
	Semiacabado("3");
	
	private String descricao;

	private Condicao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
