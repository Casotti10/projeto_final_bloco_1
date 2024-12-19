package model;

public class AcaiPacoca extends Acai {
	
	private double adicional; 
	
	public AcaiPacoca(int id, String nome, double preco, int adicional, String tamanho) {
		super(id, nome, preco, tamanho);
		this.adicional = adicional;
	} 
	public void exibirDetalhes() { //Poliformismo Sobrescrito
		System.out.println("Adicional: " + adicional);
		
	}
}