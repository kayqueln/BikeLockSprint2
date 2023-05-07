package br.com.BikeLock.main;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import br.com.BikeLock.beans.*;


public class Main {

	static String texto(String texto) {
		return JOptionPane.showInputDialog(texto);
	}
	
	static int inteiro(String inteiro){
		return Integer.parseInt(JOptionPane.showInputDialog(inteiro));
	}
	
	static double decimal (String decimal) {
		return Double.parseDouble(JOptionPane.showInputDialog(decimal)); 
	}
	
	static Date data(String data) throws HeadlessException, ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.parse(JOptionPane.showInputDialog(data));
	}
	
	public static void main(String[] args) throws HeadlessException, ParseException {
		Cadastro cadastro = new Cadastro(texto("Nome"), texto("Sobrenome"), texto("CPF"), texto("Senha"));
		Usuario usuario = new Usuario(texto("E-mail"));
		Telefone telefone = new Telefone(texto("Celular"), texto("Comercial"), texto("Contato"), texto("Fixo"));
		Endereco endereco = new Endereco(texto("Logradouro"), inteiro("Número"), texto("CEP"), texto("Bairro"), texto("Cidade"), texto("Estado"));
		Seguro seguro = new Seguro(decimal("Valor do seguro"), data("Data de validação"), data("Data de pagamento"), texto("Método de pagamento"));
		Bike bike = new Bike(texto("Marca da bike"), inteiro("Ano de fabricação"), texto("Modelo"), texto("Número de série"), decimal("Preço"));	
		Fotos fotos = new Fotos(texto("Formato da foto"), texto("Resolução da foto"), data("Data de envio"));	
		Modificacoes modificacoes = new Modificacoes(data("Data de modificação da bike"), decimal("valor da modificação"), texto("Modificação"));
		
		cadastro.setUsuario(usuario);
		usuario.setEndereco(endereco);
		usuario.setTelefone(telefone);
		usuario.setSeguro(seguro);
		seguro.setBike(bike);
		bike.setModificacoes(modificacoes);
		bike.setFotos(fotos);
		
		System.out.println(cadastro.toString());
		
		//Método que calcula o valor total da bike incluindo o valor das modificações
		System.out.println("\nO valor da sua bike com as modificações é: R$" + bike.valorTotal());
		
		//Método que calcula o valor do novo seguro (1,5% do valor total da bike)
		System.out.println("\nO seguro da sua bike custará: R$" + seguro.valorSeguro());
	}

}

/*
░░░░░░░▄▄▄█████▄▄▄░░░░░░░
░░░░░██░░░░░░░░░░░██░░░░░
░░░██░░░░░░░░░░░░░░░██░░░
░░█░░░░░░░░░░░░░░░░░░░█░░
░█░▄▀▀▀▄░░░░░░▄▀▀▀▄░░░░█░
░█▐  ▄██▌░░░░▐  ▄██▌░░░░█
█░▐▄▄███▌░░░░▐▄▄███▌░░░░█
█░░░░░░░░░░░░░░░░░░░░░░░█
█░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░█
█░░░█▒▒▒▒▒▒▒▒▒▒▒▒▒▒█░░░░█
░█░░█▒▒hahahaha▒▒▒▒█░░░░█
░░█░░█▒▒▒▒▒░░░░░░▒█░░░░█░
░░░█░░█▒▒▒░░░░░░░█░░░██░░
░░░░██░▀▀▀▀▀▀▀▀▀▀░░░█░░░░
░░░░░░▀▀▀▀██████▀▀▀▀░░░░░
█████████████████████████
*/
