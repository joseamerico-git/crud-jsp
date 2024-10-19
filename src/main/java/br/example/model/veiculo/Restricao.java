package br.example.model.veiculo;

public enum Restricao {
	Não_há("0"),
	Aliênação_Fidunciária("1"),
	Arrendamento_Mercantil("2"),
	Reserva_de_Domínio("3"),
	Penhor_de_Veículos("4"),
	Outras("5");
	
	private String descricao;
	
	private Restricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public static void main(String[] args) {
		for(Restricao r: Restricao.values()) {
			System.out.println(r.name());
		}
	}
	
}
