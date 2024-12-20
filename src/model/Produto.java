package model;

public abstract class Produto {
	private static int ultimoId = 0;
	private int id;
	private String nome;
	private double preco;

	public Produto(String nome, double preco) {
		this.id = ++ultimoId;
		this.nome = nome;
		this.preco = preco;
	}

	// Getter e Setters
	public int getId() {
		return id;
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

	@Override
	public String toString() {
		return "Produto id= " + id + ", nome = " + nome + ", preco = " + preco;
	}
}