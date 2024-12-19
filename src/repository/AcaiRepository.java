package repository;

import model.Acai;

public interface AcaiRepository {
	void cadastrarProduto(String nome);

	public void procurarPorNumero();
	public void listarAcai();
	public void cadastrar();
	public void atualizar();
	public void deletar();
}

