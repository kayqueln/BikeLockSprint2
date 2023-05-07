package br.com.BikeLock.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Modificacoes {

	private Date dataModificacao;
	private double valor;
	private String modificacao;

	public Modificacoes() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Modificacoes(Date dataModificacao, double valor, String modificacao) {
		super();
		this.dataModificacao = dataModificacao;
		this.valor = valor;
		this.modificacao = modificacao;
	}

	public String getDataModificacao() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(dataModificacao);
	}

	public void setDataModificacao(Date dataModificacao) {
		this.dataModificacao = dataModificacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getModificacao() {
		return modificacao;
	}

	public void setModificacao(String string) {
		modificacao= string;
	}

	@Override
	public String toString() {
		return "\nModificações [Data de modificação: " + getDataModificacao() + ", Valor: " + valor + ", Modificação: " + modificacao + "]";
	}

}
