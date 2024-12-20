package model;

public abstract class Acai extends Produto {

	private int id;
	private String nome;
	protected String tamanho;
	private double preco;

	public Acai(int id, String nome, double preco, String tamanho) {
		super(nome, preco);
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

	public void visualizar() {
		System.out.println("ID: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Preço: " + preco);
		System.out.println("Tamanho: " + tamanho);
	}

	protected abstract String getTamanho();

	protected abstract void setTamanho(String tamanho);
}