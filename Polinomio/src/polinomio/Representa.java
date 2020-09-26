package polinomio;

import java.util.Scanner;

public class Representa {

	private int grau;
	private int[] vetor;

	public Representa(int grau) {
		this.grau = grau;
		vetor = new int[grau + 1];
	}

	public void carrega() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i <= grau; i++) {
			System.out.println("Digite um valor: ");
			vetor[grau - i] = sc.nextInt();
		}
	}

	public void carrega(int[] vetor) {
		this.vetor = vetor;
	}

	public void mostra() {
		for (int i = grau; i >= 0; i--) {
			if (i > 1) {
				System.out.print(vetor[i] + "x" + i);
				System.out.print(" + ");
			} else if (i == 0)
				System.out.print(vetor[i]);
			else {
				System.out.print(vetor[i] + "x");
				System.out.print(" + ");
			}
		}
		System.out.println("");
	}

	public float avalia(float x) {
		float valor = 0;
		for (int i = 0; i <= grau; i++) {
			valor = (float) (valor + vetor[i] * Math.pow(x, i));
		}

		return valor;
	}

	public int getGrau() {
		return grau;
	}

	public int getElemento(int i) {
		return this.vetor[i];
	}

	public void setElemento(int x, int i) {
		this.vetor[i] = x;
	}

	public Representa soma(Representa polinomio) {
		int grausoma, val1, val2;
		if (this.grau > polinomio.getGrau())
			grausoma = this.grau;
		else
			grausoma = polinomio.getGrau();

		Representa polinomiosoma = new Representa(grausoma);

		for (int i = 0; i <= grausoma; i++) {
			if (i <= this.grau)
				val1 = vetor[i];
			else
				val1 = 0;
			if (i <= polinomio.getGrau())
				val2 = polinomio.getElemento(i);
			else
				val2 = 0;

			polinomiosoma.setElemento(val1 + val2, i);
		}

		return polinomiosoma;
	}

	public Representa multiplica(Representa polinomio) {
		int graumult = this.grau + polinomio.getGrau();

		Representa polinomiomult = new Representa(graumult);

		for (int i = 0; i <= this.grau; i++)
			for (int j = 0; j <= polinomio.getGrau(); j++)
				polinomiomult.setElemento(polinomiomult.getElemento(i + j) + vetor[i] * polinomio.getElemento(j),
						i + j);
		return polinomiomult;
	}

}
