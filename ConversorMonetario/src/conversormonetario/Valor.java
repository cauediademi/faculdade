package conversormonetario;

public class Valor {

	private float valor;
	private Moeda moeda;

	public Valor(float valor, Moeda moeda) {
		this.valor = valor;
		this.moeda = moeda;
	}

	public Valor converte(Moeda moeda) {
		Valor v1 = new Valor(0, moeda);
		v1.valor = this.valor * this.moeda.getConversao() / moeda.getConversao();
		v1.moeda = moeda;
		return v1;

	}

	public void status() {
		System.out.println("Valor: " + this.valor);
		System.out.println("Moeda: " + this.moeda.getNome());
	}

}
