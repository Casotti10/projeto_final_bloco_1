package repository;

import model.Acai;

public interface AcaiRepository {

	void deletar(int numero);
	void atualizar(Acai acai);
	void cadastrar(Acai acai);
	void procurarPorNumero(int numero);
	void listarAcai();
}

