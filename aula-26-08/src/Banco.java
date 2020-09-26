import java.util.ArrayList;

public class Banco {
	int numero;
	String nome;
	ArrayList<ContaCorrente> contas;

	Banco(){
		contas = new ArrayList<>();
	}

	void criarConta(int numero) {
		ContaCorrente cc = new ContaCorrente(numero);
		contas.add(cc);
	}

	void excluirConta(int indice) {
		contas.remove(indice);
	}
}
