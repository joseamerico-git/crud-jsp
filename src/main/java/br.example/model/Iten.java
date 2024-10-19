package br.example.model;

public class Iten {
	public String codigo;
	public String descricao;
	public String ncm;
	public String cest;
	public String cfop;
	public ValorUnitario valorUnitario;
	public double valor;
	public Tributos tributos;

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNcm() {
		return ncm;
	}

	public void setNcm(String ncm) {
		this.ncm = ncm;
	}

	public String getCest() {
		return cest;
	}

	public void setCest(String cest) {
		this.cest = cest;
	}

	public String getCfop() {
		return cfop;
	}

	public void setCfop(String cfop) {
		this.cfop = cfop;
	}

	public ValorUnitario getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(ValorUnitario valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Tributos getTributos() {
		return tributos;
	}

	public void setTributos(Tributos tributos) {
		this.tributos = tributos;
	}

}
