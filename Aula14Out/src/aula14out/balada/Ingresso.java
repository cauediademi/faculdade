package aula14out.balada;

public class Ingresso {

	private double valor;
	private String tipoDeIngresso;

	public Ingresso() {
		super();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getTipoDeIngresso() {
		return tipoDeIngresso;
	}

	public void setTipoDeIngresso(String tipoDeIngresso) {
		this.tipoDeIngresso = tipoDeIngresso;
	}

	public double imprimirValor() {
		return valor;
	}

	public String imprimirTipoDeIngresso() {
		return "Ingresso: " + tipoDeIngresso;
	}

}
