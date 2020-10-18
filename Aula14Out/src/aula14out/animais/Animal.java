package aula14out.animais;

public abstract class Animal {

	private String nome;
	private String raca;

	public Animal() {
		super();
	}

	public Animal(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String caminha() {
		return "POC POC";
	}
}
