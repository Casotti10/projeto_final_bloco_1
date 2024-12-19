package model;

public abstract class Acai {

	private int id;
	private String nome, tamanho;
	private double preco;
	

	public Acai(int id, String nome, double preco, String tamanho) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.tamanho = tamanho;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void exibirDetalhes() {
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
	}
}
