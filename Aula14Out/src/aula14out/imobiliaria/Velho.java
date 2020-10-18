package aula14out.imobiliaria;

public class Velho extends Imovel {

	private double valorDescontado;

	public Velho(double valorDescontado) {
		super();
		this.setValor(this.getValor() - valorDescontado);
	}

	public double getValorDescontado() {
		return valorDescontado;
	}

	public void setValorDescontado(double valorDescontado) {
		this.valorDescontado = valorDescontado;
	}

}
