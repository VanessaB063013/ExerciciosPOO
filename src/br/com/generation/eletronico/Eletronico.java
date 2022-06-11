package br.com.generation.eletronico;

public class Eletronico {
	
	//atributos
	
	public String produto;
	public String modelo;
	public String marca;
	public String fabricante;
	public int  tensao;
	public int largura;
	public double altura;
	public int profundidade;
	public double altura2;
	public int largura2;
	public int profundidade2;
	
	public double consumo;
	
	public Eletronico(String produto, String modelo, String marca, String fabricante, int tensao, int largura,double altura,
			int profundidade,double altura2,int largura2, int profundidade2, double consumo) {
		this.produto=produto;
		this.modelo=modelo;
		this.marca=marca;
		this.fabricante=fabricante;
		this.tensao=tensao;
		this.largura=largura;
		this.altura=altura;
		this.profundidade=profundidade;
		this.altura2=altura2;
		this.largura2=largura2;
		this.profundidade2=profundidade2;
		this.consumo=consumo;
	}
	
	public void descricaoProduto() {
		System.out.println("------------- DESCRIÇÃO DO PRODUTO-------------");
	}
	
	public void imprimirIndo() {
		System.out.println("Produto: " + produto);
		System.out.println("Modelo: " + modelo);
		System.out.println("Marca: " + marca);
		System.out.println("Fabricante: " + fabricante);
		System.out.println("Tensão: " + tensao + "V");
		System.out.println("Largura: " + largura + " cm");
		System.out.println("Altura: " + altura + " cm");
		System.out.println("Profundidade : "+ profundidade + " cm");
		System.out.println("Medida (AxLxP): "+ altura2 + "x" + largura2 + "x" + profundidade2 + " cm.");
		System.out.println("Consumo: " + consumo + "KWh/mês");
	}
	
	
	

}
