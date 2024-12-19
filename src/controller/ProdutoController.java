package controller;

import java.util.ArrayList;
import java.util.List;

import model.Acai;
import repository.AcaiRepository;

public class ProdutoController implements AcaiRepository {

	private List<Acai> listaProdutos = new ArrayList<>();

	int numero = 0;

	
	@Override
	public void procurarPorNumero(int numero) {
		var acai = buscarNaCollection(numero);
		if (acai != null) {
			acai.visualizar(); 
		} else {
			System.out.println("\nAçaí com número: " + numero + " não foi encontrado!");
		}
	}


	private Acai buscarNaCollection(int numero) {
		for (var acai : listaProdutos) {
			if (acai.getId() == numero) {
				return acai; 
			}
		}
		return null;
		
	}

	@Override
	public void listarAcai() {
		if (listaProdutos.isEmpty()) {
			System.out.println("Não há Açaís cadastrados.");
		} else {
			for (Acai acai : listaProdutos) {
				acai.visualizar();
			}
		}
	}

	// Cadastrar um novo Açaí
	@Override
	public void cadastrar(Acai acai) {
		listaProdutos.add(acai);
		System.out.println("Açaí cadastrado: " + acai.getNome());
	}

	// Atualizar um Açaí existente
	@Override
	public void atualizar(Acai acai) {
		Acai acaiExistente = buscarNaCollection(acai.getId());
		if (acaiExistente != null) {
			acaiExistente.setNome(acai.getNome());
			acaiExistente.setPreco(acai.getPreco());
			System.out.println("Açaí atualizado: " + acai.getNome());
		} else {
			System.out.println("Açaí não encontrado para atualização.");
		}
	}

	// Deletar um Açaí
	@Override
    public void deletar(int numero) {
        Acai acai = buscarNaCollection(numero);
        if (acai != null) {
            listaProdutos.remove(acai);
            System.out.println("Açaí deletado: " + acai.getNome());
        } else {
            System.out.println("Açaí não encontrado para deleção.");
        }
	}
}



