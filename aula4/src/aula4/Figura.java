package aula4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Figura {
	private float lado1 = 0;
	private float lado2 = 0;
	private float lado3 = 0;
	private float raio = 0;
	private String tipo = "ENIGMA";

	public Figura() {
	}

	public float getLado1() {
		return lado1;
	}

	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}

	public float getLado2() {
		return lado2;
	}

	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}

	public float getLado3() {
		return lado3;
	}

	public void setLado3(float lado3) {
		this.lado3 = lado3;
	}

	public float getRaio() {
		return raio;
	}

	public void setRaio(float raio) {
		this.raio = raio;
	}

	public String getTipo() {
		if (this.lado1 != 0 && this.lado2 != 0) {
			if (this.lado1 == this.lado2) {
				// figura.imprimirCaracteresComDelay("======= A SUA FIGURA PODE SER UM QUADRADO ====================", 10);
				return "QUADRADO ====================";
			} else {
				// figura.imprimirCaracteresComDelay("======= A SUA FIGURA PODE SER UM RETÂNGULO ===================", 10);
				return "RETÂNGULO ===================";
			}
		}

		if (this.lado1 != 0 && this.lado2 != 0 && this.lado3 != 0) {
			if (this.lado1 == this.lado2 && this.lado2 == this.lado3) {
				// figura.imprimirCaracteresComDelay("======= A SUA FIGURA PODE SER UM TRINÂNGULO EQUILÁTERO =======", 10);
				return "TRINÂNGULO EQUILÁTERO =======";
			} else if (this.lado1 != this.lado2 && this.lado1 != this.lado3 && this.lado2 != this.lado3) {
				// figura.imprimirCaracteresComDelay("======= A SUA FIGURA PODE SER UM TRINÂNGULO ESCALENO =========", 10);
				return "TRINÂNGULO ESCALENO =========";
			} else {
				// figura.imprimirCaracteresComDelay("======= A SUA FIGURA PODE SER UM TRINÂNGULO ISÓSCELES ========", 10);
				return "TRINÂNGULO ISÓSCELES ========";
			}
		}

		// figura.imprimirCaracteresComDelay("======= A SUA FIGURA PODE SER UM CÍRCULO =====================", 10);
		if (this.raio != 0) {
			return "CÍRCULO =====================";
		}

		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public static void imprimirComDelay(String dados, long delay) throws InterruptedException {
		System.out.println(dados);
		Thread.sleep(delay);
	}

	public static void imprimirCaracteresComDelay(String dados, long delay) throws InterruptedException {
		for (char ch : dados.toCharArray()) {
			System.out.print(ch);
			Thread.sleep(delay);
		}
		System.out.println("");
	}

	public static void imprimirCaracteresComDelaySemLn(String dados, long delay) throws InterruptedException {
		for (char ch : dados.toCharArray()) {
			System.out.print(ch);
			Thread.sleep(delay);
		}
		System.out.print("");
	}

}
