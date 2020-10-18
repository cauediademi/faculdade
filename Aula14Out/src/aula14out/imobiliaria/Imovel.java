package aula14out.imobiliaria;

public class Imovel {

	private String endereco;
	private double valor;

	public Imovel() {
		super();
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String imprimirDadosDoImovel() {
		return "\nEndereço: " + endereco + "\nValor: R$" + valor;
	}
}
