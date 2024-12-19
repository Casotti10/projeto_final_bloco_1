package ecommerce;

import java.util.InputMismatchException;
import java.util.Scanner;

import cores.Cores;

public class Menu {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

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

			switch (opcao) {
			case 1:
				System.out.println("Cadastrar Produto: \n\n");

				break;
			case 2:
				System.out.println("Listar Produto: \n\n");

				break;
			case 3:
				System.out.println("Buscar produto: \n\n");
				
				break;
			case 4:
				System.out.println("Atualizar Produto \n\n");
				
				break; 
			case 5:
				System.out.println("Deletar Produto \n\n");
				
				break;
			case 6:
				System.out.println("Sair Produto \n\n");
			
				break;
			}

	
		}
	}
}
