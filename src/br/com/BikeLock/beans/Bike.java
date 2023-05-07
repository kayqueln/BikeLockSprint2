package br.com.BikeLock.beans;

public class Bike {

	private String marca;
	private int ano;
	private String modelo;
	private String numeroSerie;
	private double preco;
	private Modificacoes modificacoes;
	private Fotos fotos;

	public Bike() {
		super();
	}

	public Bike(String marca, int ano, String modelo, String numeroSerie, double preco, Modificacoes modificacoes, Fotos fotos) {
		super();
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.preco = preco;
		this.modificacoes = modificacoes;
		this.fotos = fotos;
	}

	public Bike(String marca, int ano, String modelo, String numeroSerie, double preco) {
		super();
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
		this.numeroSerie = numeroSerie;
		this.preco = preco;
	}

	public Fotos getFotos() {
		return fotos;
	}

	public void setFotos(Fotos fotos) {
		this.fotos = fotos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Modificacoes getModificacoes() {
		return modificacoes;
	}

	public void setModificacoes(Modificacoes modificacoes) {
		this.modificacoes = modificacoes;
	}
	
	public double valorTotal() {
		double valorTotal = getPreco() + getModificacoes().getValor();
		return valorTotal;
	}

	@Override
	public String toString() {
		return "\nBike [Marca: " + marca + ", Ano: " + ano + ", Modelo: " + modelo + ", Numero de série: " + numeroSerie
				+ ", Preço: " + preco + "]" + modificacoes + fotos;
	}
	
}
