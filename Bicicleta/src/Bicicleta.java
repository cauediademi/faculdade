
public class Bicicleta {
	public int codigo;
	public String modelo;
	private String marca;
	private float velocidade;
	private int marcha;
	private float velocidadeMaxima;

	Bicicleta(float velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public void status() {
		System.out.println("Código: " + this.codigo);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Velocidade atual: " + this.velocidade);
		System.out.println("Marcha: " + this.marcha);
		System.out.println("Velocidade máxima: " + this.velocidadeMaxima);
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setVelocidade(float velocidade) {
		if (velocidade > this.velocidadeMaxima) {
			System.out.println("Velocidade maior que a máxima permitida");
		} else {
			this.velocidade = velocidade;
		}
	}

}
