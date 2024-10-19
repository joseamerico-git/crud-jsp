package br.example.model.veiculo;

public enum TipoCombustivel {
	   
	   ALCOOL("01"),
	   GASOLINA("02"),
	   DIESEL("03"),
	   ALCOOL_GASOLINA("16"),
	   GASOLINA_ALCOOL_GNV("17");
	
	
	private String descricao;
	private Integer tipoCombustivel;
	
	public Integer getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(Integer tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	TipoCombustivel(String descricao) {
		// TODO Auto-generated constructor stub
		this.tipoCombustivel= Integer.valueOf(descricao);
		this.descricao = descricao;
	}
	   
	public static void main(String[] args) {
		System.out.println(TipoCombustivel.ALCOOL.getDescricao());
	}
}
