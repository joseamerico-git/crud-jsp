package br.example.model.veiculo;

public enum CondicaoVin {
	R("Remarcado"),
	N("Normal");
	private String descricao;
	
	private CondicaoVin(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
