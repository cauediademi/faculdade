import java.util.ArrayList;
import java.util.Iterator;

public class ContaCorrente {
	int numero;
	float saldo;
	String status;
	float limite;
	ArrayList<Movimentacao> movimentacoes;

	ContaCorrente(int numero) {
		this.numero = numero;
		this.limite = 0;
		this.status = "Simples";
		movimentacoes = new ArrayList<Movimentacao>();
	}

	void mostrarEstado() {
		System.out.println("Número: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Status: " + this.status);
		System.out.println("Limite: " + this.limite);
	}

	void alterarSaldo(float valor) {
		this.saldo = valor;
	}

	void alterarStatus(String status) {
		this.status = status;
	}

	void alterarLimite(float limite) {
		this.limite = limite;
	}

	void movimentar(float valor, String tipo) {
		Movimentacao m = new Movimentacao();

		if(tipo.equals("Saque")) {
			if(this.saldo < valor) {
				System.out.println("Saldo insuficiente");
			}else {
				m.saque(valor);
				this.saldo -= valor;
				movimentacoes.add(m);
			}
		} else if(tipo.equals("Depósito")) {
			m.deposito(valor);
			this.saldo += valor;
			movimentacoes.add(m);
		}

	}

	void mostrarSaldo() {
		System.out.println("Saldo: " + this.saldo);
	}

	void extrato() {
		Iterator<Movimentacao> it = movimentacoes.iterator();
		Movimentacao m;

		while(it.hasNext()) {
			m = it.next();
			System.out.println(m.descricao);
			System.out.println(m.creditoDebito);
			System.out.println(m.valor);
			System.out.println("------------------------------------------");
		}
		System.out.println("Saldo: " + this.saldo);
	}

}
