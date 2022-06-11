package br.com.generation.eletronico;

public class TestaEletronico {

	public static void main(String[] args) {
		Eletronico eletronico1 = new Eletronico ("Geladeira", "TF39", "Eletrolux", "Eletrolux do Brasil S.A",  127, 
				 60, 171.5,61, 171.5, 60 ,61, 43.6);
		eletronico1.descricaoProduto();
		eletronico1.imprimirIndo();
		
		
	}
}