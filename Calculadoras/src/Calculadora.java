public class Calculadora {

	private float n1;
	private float n2;
	private float memoria;
	private float resultado;

	Calculadora(float n1) {
		this.n1 = n1;
	}

	Calculadora(float n1, float n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public float getN1() {
		return n1;
	}

	public void setN1(float n1) {
		this.n1 = n1;
	}

	public float getN2() {
		return n2;
	}

	public void setN2(float n2) {
		this.n2 = n2;
	}

	public float getMemoria() {
		return memoria;
	}

	public void setMemoria(float memoria) {
		this.memoria = memoria;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}

	public void somar(float num1, float num2) {
		this.resultado = num1 + num2;
	}

	public void subtrair(float num1, float num2) {
		this.resultado = num1 - num2;
	}

	public void multiplicar(float num1, float num2) {
		this.resultado = num1 * num2;
	}

	public void dividir(float num1, float num2) {
		this.resultado = num1 / num2;
	}

}
