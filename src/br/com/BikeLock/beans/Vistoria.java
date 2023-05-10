package br.com.BikeLock.beans;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Vistoria {

	private Date dataVistoria;
	private String avarias;
	private String observacoes;
	private String estado;
	private Bike bike;

	public Vistoria() {
		super();
	}

	public Vistoria(Date dataVistoria, String avarias, String observacoes, String estado, Bike bike) {
		super();
		this.dataVistoria = dataVistoria;
		this.avarias = avarias;
		this.observacoes = observacoes;
		this.estado = estado;
		this.bike = bike;
	}
	
	public Vistoria(Date dataVistoria, String avarias, String observacoes, String estado) {
		super();
		this.dataVistoria = dataVistoria;
		this.avarias = avarias;
		this.observacoes = observacoes;
		this.estado = estado;
	}

	public String getDataVistoria() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(dataVistoria);
	}

	public void setDataVistoria(Date dataVistoria) {
		this.dataVistoria = dataVistoria;
	}

	public String getAvarias() {
		return avarias;
	}

	public void setAvarias(String avarias) {
		this.avarias = avarias;
	}

	public String getObservações() {
		return observacoes;
	}

	public void setObservações(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Bike getBike() {
		return bike;
	}

	public void setBike(Bike bike) {
		this.bike = bike;
	}

	@Override
	public String toString() {
		return "\nVistoria [Data da vistoria: " + getDataVistoria() + ", Avarias: " + avarias + ", Observações: " + observacoes
				+ ", Estado: " + estado + "]" + bike;
	}
}
