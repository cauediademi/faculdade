package aula14out;

import java.util.Scanner;

import aula14out.animais.Cachorro;
import aula14out.animais.Gato;
import aula14out.balada.CamaroteInferior;
import aula14out.balada.CamaroteSuperior;
import aula14out.balada.Ingresso;
import aula14out.balada.Normal;
import aula14out.classeseconomicas.Miseravel;
import aula14out.classeseconomicas.Pobre;
import aula14out.classeseconomicas.Rica;
import aula14out.imobiliaria.Imovel;
import aula14out.imobiliaria.Novo;
import aula14out.imobiliaria.Velho;

public class Teste {

	public static void main(String[] args) {

		/** Testar Animais **/
		// Cachorro
		Cachorro magrelinho = new Cachorro();
		magrelinho.setNome("Magrelinho");
		magrelinho.setRaca("Vira-lata");

		System.out.println(magrelinho.late());
		System.out.println(magrelinho.caminha());

		// Gato
		Gato gatito = new Gato();
		gatito.setNome("Gatito");
		gatito.setRaca("Gato galático");

		System.out.println(gatito.mia());
		System.out.println(gatito.caminha());

		/** Testar Classes Economicas **/
		// Rica
		Rica richBitch = new Rica();
		richBitch.setNome("Rich Bitch");
		richBitch.setIdade(17);
		richBitch.setDinheiro(6666666.66);

		System.out.println(richBitch.fazCompras());

		// Pobre
		Pobre tioDaPadaria = new Pobre();
		tioDaPadaria.setNome("Tio Da Padaria");
		tioDaPadaria.setIdade(53);

		System.out.println(tioDaPadaria.trabalha());

		// Miseravel
		Miseravel zeBarba = new Miseravel();
		zeBarba.setNome("Zé Barba");
		zeBarba.setIdade(41);

		System.out.println(zeBarba.mendiga());

		/** Testar Balada **/
		// Ingresso por User Input
		Ingresso ingresso = new Ingresso();
		ingresso.setValor(120);

		Scanner input = new Scanner(System.in);
		System.out.print("\n\nESCOLHA O TIPO DE INGRESSO QUE DESEJA");

		int inputIngresso = 0;
		int inputVIP = 0;
		do {
			System.out.print("DIGITE 1 PARA NORMAL\nOU 2 PARA VIP");
			inputIngresso = input.nextInt();

			if (inputIngresso == 1) {
				ingresso = new Normal();
			} else if (inputIngresso == 2) {
				do {
					System.out.print("DIGITE 1 PARA CAMAROTE SUPERIOR\nOU 2 PARA CAMAROTE INFERIOR");
					inputVIP = input.nextInt();
				} while (inputVIP != 1 || inputVIP != 2);
			} else {
				System.out.println("É PRA DIGITAR 1, OU 2!!!");
			}
		} while (inputIngresso != 1 || inputIngresso != 2);

		if (inputVIP == 1) {
			ingresso = new CamaroteSuperior();
		} else if (inputVIP == 2) {
			ingresso = new CamaroteInferior();
		}

		System.out.println(ingresso.imprimirTipoDeIngresso() + " Valor: R$ " + ingresso.imprimirValor());

		/** Testar Imobiliaria **/
		// Imovel por User Input
		Imovel imovel = new Imovel();
		imovel.setValor(500000.00);

		Scanner input2 = new Scanner(System.in);
		System.out.println("\n\nESCOLHA SEU IMÓVEL");

		int inputImovel = 0;
		do {
			System.out.println("DIGITE 1 PARA NOVO E 2 PARA VELHO");
			inputImovel = input2.nextInt();

			if (inputImovel == 1) {
				imovel = new Novo(250000.00);
			} else if (inputImovel == 2) {
				imovel = new Velho(125000.00);
			} else {
				System.out.print("FAZ FAVOR, ZÉ... DIGITA 1 OU 2!!!");
			}
		} while (inputImovel != 1 || inputImovel != 2);

		System.out.println(imovel.imprimirDadosDoImovel());

	}
}
