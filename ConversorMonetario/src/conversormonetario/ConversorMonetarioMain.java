package conversormonetario;

public class ConversorMonetarioMain {

	public static void main(String[] args) {
		Moeda dolar = new Moeda();
		dolar.setNome("dolar");
		dolar.setConversao(5);

		Moeda real = new Moeda();
		real.setNome("real");
		real.setConversao(1);

		Moeda peso = new Moeda();
		peso.setNome("peso");
		peso.setConversao(0.07f);

		Valor v1 = new Valor(10, real);
		v1.status();

		Valor v2 = v1.converte(dolar);
		v2.status();

		Valor v3 = v2.converte(peso);
		v3.status();
	}

}
