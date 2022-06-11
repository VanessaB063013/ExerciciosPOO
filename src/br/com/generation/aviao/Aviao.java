package br.com.generation.aviao;

public class Aviao {
	public String modelo;
	public String nomeFabricante;
	public String tamanho;
	public int numeroAssentos;
	
	public Aviao(String modelo, String nomeFabricante, String tamanho, int numeroAssentos) {
		this.modelo=modelo;
		this.nomeFabricante=nomeFabricante;
		this.tamanho=tamanho;
		this.numeroAssentos=numeroAssentos;
			
	}

	
	public void descricaoAviao() {
		System.out.println("----------- INFORMAÇÕES NO REGISTRO ---------");
	}
	
	public void imprimirInfo() {
		System.out.println("Constam as seguintes informações em nosso registro: ");
		System.out.println("Modelo: " + modelo);
		System.out.println("Nome do Fabricante: " + nomeFabricante);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("Quantidade de assetos: " + numeroAssentos);
	}
	
}

