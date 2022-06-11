package br.com.generation.exerciciospoo;

public class TestaCliente {
	
	public static void main(String[] args) {
// instanciar um objeto da classe Cliente 
		Cliente novo = new Cliente("Vanessa Basilio Jardim", 29, "(11)97040-5383", "vanessajardim063013@gmail.com");
		novo.dadosCliente();
		novo.imprimirInfo();
		
		
	}
}
