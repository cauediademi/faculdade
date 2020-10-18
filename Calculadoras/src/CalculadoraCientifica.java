
public class CalculadoraCientifica extends Calculadora {

	CalculadoraCientifica(float n1){
		super(n1);
	}

	CalculadoraCientifica(float n1, float n2){
		super(n1, n2);
	}

	public void raizQuadrada(float num) {
		this.setResultado((float) Math.sqrt(num));
	}

	public void potencia(float base, float expoente) {
		this.setResultado((float) Math.pow(base, expoente));
	}

}
