package br.com.BikeLock.beans;

public class Cadastro {

	private String nome;
	private String sobrenome;
	private String cpf;
	private Usuario usuario;

	public Cadastro() {
		super();

	}

	public Cadastro(String nome, String sobrenome, String cpf) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}

	public Cadastro(String nome, String sobrenome, String cpf, Usuario usuario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.usuario = usuario;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "\nCadastro [Nome: " + nome + ", Sobrenome: " + sobrenome + ", CPF: " + cpf  + "]" + usuario;
	}
}
