package polinomio;

public class Polinomio {

	public static void main(String[] args) {
		Representa pol1 = new Representa(2);
		pol1.carrega();
		Representa pol2 = new Representa(1);
		pol2.carrega();

		Representa pol3 = pol1.soma(pol2);
		pol3.mostra();

		Representa pol4 = pol1.multiplica(pol2);
		pol4.mostra();
	}

}
