package model;

public class AcaiEspecial extends Acai {

	private double adicional;

	public AcaiEspecial(int id, String nome, double preco, String tamanho, double adicional, String sabor) {
		super(id, nome, preco, tamanho);
		this.adicional = adicional;
	}

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}


	@Override
	public void visualizar() {
		super.visualizar(); // Exibe os atributos da classe pai
		System.out.println("Adicional: " + adicional);
	}

	protected String getTamanho() {
		return this.tamanho; // Acessa diretamente o atributo tamanho
	}

	@Override
	protected void setTamanho(String tamanho) {
	    this.tamanho = tamanho; // Define diretamente o atributo tamanho
	}
}