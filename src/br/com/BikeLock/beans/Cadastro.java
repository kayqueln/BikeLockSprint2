package br.com.BikeLock.beans;

public class Cadastro {

	private String nome;
	private String sobrenome;
	private String cpf;
	private String senha;
	private Usuario usuario;

	public Cadastro() {
		super();

	}

	public Cadastro(String nome, String sobrenome, String cpf, String senha) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
	}

	public Cadastro(String nome, String sobrenome, String cpf, String senha, Usuario usuario) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
		this.senha = senha;
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

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "\nCadastro [Nome: " + nome + ", Sobrenome: " + sobrenome + ", CPF: " + cpf + ", Senha: " + senha + "]" + usuario;
	}
}
