package br.com.BikeLock.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Seguro {

	private double valor;
	private Date dataValidacao;
	private Date dataPagamento;
	private String metodoPagamento;
	private Bike bike;

	public Seguro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Seguro(double valor, Date dataValidacao, Date dataPagamento, String metodoPagamento, Bike bike) {
		super();
		this.valor = valor;
		this.dataValidacao = dataValidacao;
		this.dataPagamento = dataPagamento;
		this.metodoPagamento = metodoPagamento;
		this.bike = bike;
	}

	public Seguro(double valor, Date dataValidacao, Date dataPagamento, String metodoPagamento) {
		super();
		this.valor = valor;
		this.dataValidacao = dataValidacao;
		this.dataPagamento = dataPagamento;
		this.metodoPagamento = metodoPagamento;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataValidacao() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(dataValidacao);
	}

	public void setDataValidacao(Date dataValidacao) {
		this.dataValidacao = dataValidacao;
	}

	public String getDataPagamento() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(dataPagamento);
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public String getMetodoPagamento() {
		return metodoPagamento;
	}

	public void setMetodoPagamento(String metodoPagamento) {
		this.metodoPagamento = metodoPagamento;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}
	
	public double valorSeguro() {
		double valorSeguro = getBike().valorTotal() * 0.015;
		return valorSeguro;
	}

	@Override
	public String toString() {
		return "\nSeguro [Valor: " + valor + ", Data de validação: " + getDataValidacao() + ", Data de pagamento: " + getDataPagamento()
				+ ", Método de pagamento: " + metodoPagamento + "]" + bike;
	}
}
