package br.example.model;

public class ValorUnitario {
	public double comercial;
	public double tributavel;

	public ValorUnitario(double comercial, double tributavel) {
		// TODO Auto-generated constructor stub
		this.comercial = comercial;
		this.tributavel = tributavel;
	}

	public double getComercial() {
		return comercial;
	}

	public void setComercial(double comercial) {
		this.comercial = comercial;
	}

	public double getTributavel() {
		return tributavel;
	}

	public void setTributavel(double tributavel) {
		this.tributavel = tributavel;
	}

}
