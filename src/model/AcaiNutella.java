package model;

public class AcaiNutella extends Acai {

	private double adicional; 
	
	public AcaiNutella(int id, String nome, double preco,String tamanho, int adicional) {
		super(id, nome, preco, tamanho);
		this.adicional = adicional;
	}
	
	public AcaiNutella(int id, String nome, double preco, String tamanho) { //poliformismo 
		super(id, nome, preco, tamanho);
		this.adicional = 5.0f; 
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public void exibirDetalhes() { //Poliformismo Sobrescrito
		System.out.println("Adicional: " + adicional);
		
	}

}
