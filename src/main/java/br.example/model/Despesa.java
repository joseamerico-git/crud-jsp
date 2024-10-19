package br.example.model;

import java.util.Date;
import java.util.Objects;

public class Despesa {

	private Integer id;
	private String descricao;
	private double valor;
	private Date data;
	private String categoria;

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Despesa despesa = (Despesa) o;
		return Double.compare(valor, despesa.valor) == 0 && Objects.equals(id, despesa.id)
				&& Objects.equals(descricao, despesa.descricao) && Objects.equals(data, despesa.data)
				&& Objects.equals(categoria, despesa.categoria);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, descricao, valor, data, categoria);
	}

	public Despesa(String descricao, double valor, Date data, String categoria) {
		this.descricao = descricao;
		this.valor = valor;
		this.data = data;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getCategoria() {
		return categoria;
	}
}
