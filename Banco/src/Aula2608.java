
public class Aula2608 {

	public static void main(String[] args) {
		Banco itau = new Banco();
		itau.numero = 341;
		itau.nome = "Banco Itau/Unibanco";
		itau.criarConta(1);
		itau.criarConta(2);
		
		ContaCorrente cc = itau.contas.get(0);
		cc.alterarSaldo(5000);
		cc.movimentar(100, "Saque");
		cc.movimentar(500, "Depósito");
		cc.movimentar(300, "Saque");
		cc.movimentar(150, "Depósito");
		cc.extrato();
		cc.mostrarEstado();
		
	}
}
