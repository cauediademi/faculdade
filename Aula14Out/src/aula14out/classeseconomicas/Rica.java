package aula14out.classeseconomicas;

public class Rica extends Pessoa {

	private double dinheiro;

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}

	public String fazCompras() {
		return "Nois compra pq pode, se liga na carteira do pai R$" + dinheiro;
	}
}
