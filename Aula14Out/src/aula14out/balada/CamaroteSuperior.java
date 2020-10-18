package aula14out.balada;

public class CamaroteSuperior extends VIP {

	public CamaroteSuperior() {
		super();
		this.setTipoDeIngresso("Camarote Superior");
		this.setValorAdicional(this.getValor() * 0.8);
	}

}
