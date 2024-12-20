package ecommerce;

import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {

	private static List<Produto> produtos = new ArrayList<>(); // Lista para armazenar os produtos
	private static int idCounter = 1; // Contador para gerar ID único para cada produto

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int id, adicional;
		String nome, tamanho, sabor;
		double preco;
		int opcao;

		while (true) {
			System.out.println(Cores.TEXT_GREEN_BOLD_BRIGHT + Cores.ANSI_PURPLE_BACKGROUND
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("      CADASTRO DE E-COMMERCE: AÇAI UAI               " + Cores.TEXT_YELLOW_BOLD_BRIGHT);
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar Produto                    ");
			System.out.println("            2 - Listar Produtos                      ");
			System.out.println("            3 - Buscar Produto por Numero            ");
			System.out.println("            4 - Atualizar Produto                    ");
			System.out.println("            5 - Deletar Produto                      ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch (InputMismatchException e) {
				System.out.println("Entrada Inválida. Por favor, digite uma opção válida.");
				leia.nextLine();
				continue;
			}

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n AÇAI BAO DEMAIS UAI! ");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				cadastrarProduto(leia);
				break;
			case 2:
				listarProdutos();
				break;
			case 3:
				buscarProduto(leia);
				break;
			case 4:
				atualizarProduto(leia);
				break;
			case 5:
				deletarProduto(leia);
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}
	}

	// Método para cadastrar produto
	public static void cadastrarProduto(Scanner leia) {
		System.out.println(Cores.TEXT_WHITE_BOLD + "Cadastrar Produto: \n\n");
		System.out.print("Nome do produto: ");
		String nome = leia.nextLine();
		System.out.print("Preço: ");
		double preco = leia.nextDouble();
		leia.nextLine();
		System.out.print("Tamanho: ");
		String tamanho = leia.nextLine();
		System.out.print("Sabor: ");
		String sabor = leia.nextLine();

		Produto novoProduto = new Produto(idCounter++, nome, preco, tamanho, sabor);
		produtos.add(novoProduto);

		System.out.println("Produto cadastrado com sucesso!");
		keyPress();
	}

	// Método para listar produtos
	public static void listarProdutos() {
		if (produtos.isEmpty()) {
			System.out.println("Nenhum produto cadastrado.");
		} else {
			System.out.println(Cores.TEXT_WHITE_BOLD + "Lista de Produtos: ");
			for (Produto p : produtos) {
				System.out.println(p);
			}
		}
		keyPress();
	}

	// Método para buscar produto por ID
	public static void buscarProduto(Scanner leia) {
		System.out.print("Digite o número do pedido (ID do produto): ");
		int idBusca = leia.nextInt();

		Produto produto = null;
		for (Produto p : produtos) {
			if (p.getId() == idBusca) {
				produto = p;
				break;
			}
		}

		if (produto != null) {
			System.out.println("Produto encontrado: " + produto);
		} else {
			System.out.println("Produto não encontrado.");
		}
		keyPress();
	}

	// Método para atualizar produto
	public static void atualizarProduto(Scanner leia) {
		System.out.print("Digite o número do pedido (ID do produto) para atualizar: ");
		int idAtualiza = leia.nextInt();
		leia.nextLine();

		Produto produto = null;
		for (Produto p : produtos) {
			if (p.getId() == idAtualiza) {
				produto = p;
				break;
			}
		}

		if (produto != null) {
			System.out.print("Novo nome: ");
			produto.setNome(leia.nextLine());
			System.out.print("Novo preço: ");
			produto.setPreco(leia.nextDouble());
			leia.nextLine();
			System.out.print("Novo tamanho: ");
			produto.setTamanho(leia.nextLine());
			System.out.print("Novo sabor: ");
			produto.setSabor(leia.nextLine());

			System.out.println("Produto atualizado com sucesso!");
		} else {
			System.out.println("Produto não encontrado.");
		}
		keyPress();
	}

	// Método para deletar produto
	public static void deletarProduto(Scanner leia) {
		System.out.print("Digite o número do pedido (ID do produto) para deletar: ");
		int idDeleta = leia.nextInt();

		Produto produto = null;
		for (Produto p : produtos) {
			if (p.getId() == idDeleta) {
				produto = p;
				break;
			}
		}

		if (produto != null) {
			produtos.remove(produto);
			System.out.println("Produto deletado com sucesso!");
		} else {
			System.out.println("Produto não encontrado.");
		}
		keyPress();
	}

	// Método para aguardar a tecla Enter
	private static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}
	}

	// Classe Produto
	public static class Produto {
        private int id;
        private String nome;
        private double preco;
        private String tamanho;
        private String sabor;

        public Produto(int id, String nome, double preco, String tamanho, String sabor) {
            this.id = id;
            this.nome = nome;
            this.preco = preco;
            this.tamanho = tamanho;
            this.sabor = sabor;
        }

        public int getId() {
            return id;
        }

        public String getNome() {
            return nome;
        }

        public double getPreco() {
            return preco;
        }

        public String getTamanho() {
            return tamanho;
        }

        public String getSabor() {
            return sabor;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public void setTamanho(String tamanho) {
            this.tamanho = tamanho;
        }

        public void setSabor(String sabor) {
            this.sabor = sabor;
        }

        @Override
        public String toString() {
            return "ID: " + id + " | Nome: " + nome + " | Preço: " + preco + " | Tamanho: " + tamanho + " | Sabor: " + sabor;
        }
	}
}
