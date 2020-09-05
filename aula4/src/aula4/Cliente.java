package aula4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws IOException, InterruptedException {
		int DELAY_PADRAO = 500;
		int MEIO_DELAY = 250;
		int DELAY_DOBRO = 1000;
		int DELAY_CHAR = 50;

		Figura figura = new Figura();
		Scanner scanner = new Scanner(System.in);

		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirCaracteresComDelay("========= OLÁ, SOU MERLIM, O MAGO, UM EXÍMIO ADVINHO =========", DELAY_CHAR);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirCaracteresComDelay("================= NÃO ACREDITA? VOU PROVAR ===================", DELAY_CHAR);
		figura.imprimirCaracteresComDelay("===== DÊ VALORES PARA AS VARIÁVEIS QUE ACHAR NECESSÁRIO ======", DELAY_CHAR);
		figura.imprimirCaracteresComDelay("==== E EU IREI PREVER QUAL TIPO DE FIGURA PODE FORMAR-SE =====", DELAY_CHAR);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirComDelay("", MEIO_DELAY);
		figura.imprimirComDelay("", MEIO_DELAY);

		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirComDelay("== LEMBRE-SE, SE NÃO QUISER USAR ALGUM VALOR PARA A FIGURA ===", DELAY_PADRAO);
		figura.imprimirComDelay("== APENAS DIGITE O NÚMERO \"0\" QUE ESSE CAMPO SERÁ ANULADO ==", DELAY_PADRAO);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirComDelay("", MEIO_DELAY);
		figura.imprimirComDelay("", MEIO_DELAY);

		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirCaracteresComDelay("=============== DIGITE UM VALOR PARA O LADO 1 ================", DELAY_CHAR);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.setLado1(scanner.nextFloat());
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirCaracteresComDelay("=============== DIGITE UM VALOR PARA O LADO 2 ================", DELAY_CHAR);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.setLado2(scanner.nextFloat());
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirCaracteresComDelay("=============== DIGITE UM VALOR PARA O LADO 3 ================", DELAY_CHAR);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.setLado3(scanner.nextFloat());
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirCaracteresComDelay("================ DIGITE UM VALOR PARA O RAIO =================", DELAY_CHAR);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.setRaio(scanner.nextFloat());
		scanner.close();

		figura.imprimirCaracteresComDelay("HMMMM, ESTOU PENSANDO...", MEIO_DELAY);
		figura.imprimirCaracteresComDelay("...", DELAY_DOBRO);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirCaracteresComDelay("======================== JÁ SEI !!! ==========================", DELAY_CHAR);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirCaracteresComDelaySemLn("======= A SUA FIGURA PODE SER UM ", DELAY_CHAR);
		figura.imprimirCaracteresComDelay(figura.getTipo(), DELAY_CHAR);
		figura.imprimirComDelay("==============================================================", DELAY_PADRAO);
		figura.imprimirComDelay("", DELAY_DOBRO);
		figura.imprimirComDelay("", DELAY_DOBRO);
	}

}
