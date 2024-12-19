package model;

public class AcaiEspecial extends Acai {

	private double adicional;
	private String sabor; 
	
	public AcaiEspecial(int id, String nome, double preco,String tamanho, int adicional, String sabor) {
		super(id, nome, preco, tamanho);
		this.adicional = adicional;
		this.sabor = sabor;
	}
	
	
	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public void visualizar() { //Poliformismo Sobrescrito
		System.out.println("Adicional: " + adicional);
		
	}


	@Override
	protected Object getTamanho() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	protected void setTamanho(Object tamanho2) {
		// TODO Auto-generated method stub
		
	}

}
