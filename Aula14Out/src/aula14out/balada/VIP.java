package aula14out.balada;

public class VIP extends Ingresso {

	private double valorAdicional;

	public VIP() {
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
