package br.com.BikeLock.beans;

public class Usuario {

	private String email;
	private String senha;
	private Endereco endereco;
	private Telefone telefone;
	private Seguro seguro;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Usuario(String email, String senha, Endereco endereco, Telefone telefone, Seguro seguro) {
		super();
		this.email = email;
		this.senha = senha;
		this.endereco = endereco;
		this.telefone = telefone;
		this.seguro = seguro;
	}
	
	public Usuario(String email, String senha) {
		super();
		this.email = email;
		this.senha = senha;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	

	@Override
	public String toString() {
		return "\nUsuario [E-mail: " + email + ", Senha: " + senha + "]" + endereco +  telefone + seguro;
	}

}
