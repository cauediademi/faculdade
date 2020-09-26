
public class Movimentacao {
	String descricao;
	float valor;
	char creditoDebito;

	void saque(float valor) {
		this.creditoDebito = 'D';
		this.valor = valor;
		this.descricao = "Débito em conta corrente";
	}

	void deposito(float valor) {
		this.creditoDebito = 'C';
		this.valor = valor;
		this.descricao = "Crédito em conta corrente";
	}

}
