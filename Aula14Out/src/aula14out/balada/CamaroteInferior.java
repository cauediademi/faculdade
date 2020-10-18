package aula14out.balada;

public class CamaroteInferior extends VIP {

	private String localizacao;

	public CamaroteInferior() {
		super();
		this.setTipoDeIngresso("Camarote Inferior");
		this.setValorAdicional(this.getValor() * 0.5);
	}

	public String imprimirLocalizacao() {
		return localizacao;
	}

}
