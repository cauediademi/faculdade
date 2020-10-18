package aula14out.imobiliaria;

public class Novo extends Imovel {

	private double valorAdicional;

	public Novo(double valorAdicional) {
		super();
		this.setValor(this.getValor() + valorAdicional);
	}

	public double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}

}
