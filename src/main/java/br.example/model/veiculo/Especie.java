package br.example.model.veiculo;

public enum Especie {
	PASSAGEIRO("01"),
	CARGA("02"),
	MISTO("03"), 
	CORRIDA("04"),
	TRACAO("05"),
	ESPECIAL("06");
	
	private String descricao;
	
	private Especie(String descricao) {
		this.descricao = descricao;
		// TODO Auto-generated constructor stub
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static void main(String[] args) {
		for(Especie e: Especie.values()) {
			System.out.println(e.name());
		}
	}

}
