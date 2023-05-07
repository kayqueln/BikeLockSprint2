package br.com.BikeLock.beans;

public class Telefone {

	private String celular;
	private String comercial;
	private String contato;
	private String fixo;

	public Telefone() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Telefone(String celular, String comercial, String contato, String fixo) {
		super();
		this.celular = celular;
		this.comercial = comercial;
		this.contato = contato;
		this.fixo = fixo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getComercial() {
		return comercial;
	}

	public void setComercial(String comercial) {
		this.comercial = comercial;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getFixo() {
		return fixo;
	}

	public void setFixo(String fixo) {
		this.fixo = fixo;
	}

	@Override
	public String toString() {
		return "\nTelefone [Celular: " + celular + ", Comercial: " + comercial + ", Contato: " + contato + ", Fixo: " + fixo
				+ "]";
	}

}
