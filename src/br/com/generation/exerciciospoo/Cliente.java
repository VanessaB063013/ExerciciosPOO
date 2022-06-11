package br.com.generation.exerciciospoo;

import java.util.Scanner;

public class Cliente {

	// declarar os atributos
	private String nome;
	private int idade;
	private String telefone;
	private String email;

	// criar um método especial construtor

	public Cliente(String nome, int idade, String telefone, String email) {
		this.nome = nome; 
		this.idade = idade;
		this.telefone = telefone;
		this.email = email;

	}

	// declarar demais metodos da classe

	public void dadosCliente() {
		System.out.println("----- DADOS DO CLIENTE:------");
		
	}
	
	public void imprimirInfo() {
		System.out.println("informações de cadastro: \n");
		System.out.println(
				"A(o) cliente " + nome + ", de idade " + idade + ", possui o telefone telefone, " + telefone + " e email: " + email);

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
