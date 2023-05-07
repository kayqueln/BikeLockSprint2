package br.com.BikeLock.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fotos {

	private String formato;
	private String resolucao;
	private Date dataEnvio;

	public Fotos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Fotos(String formato, String resolucao, Date dataEnvio) {
		super();
		this.formato = formato;
		this.resolucao = resolucao;
		this.dataEnvio = dataEnvio;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public String getResolucao() {
		return resolucao;
	}

	public void setResolucao(String resolucao) {
		this.resolucao = resolucao;
	}

	public String getDataEnvio(){
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			return sdf.format(dataEnvio);
	}

	public void setDataEnvio(Date dataEnvio) {
		this.dataEnvio = dataEnvio;
	}


	@Override
	public String toString(){
			return "\nFotos [Formato: " + formato + ", Resolucao: " + resolucao + ", Data de envio: " + getDataEnvio() + "]";
	}

}
