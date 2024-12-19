package manga;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		int numero, opcao;
		String nome, autor, genero, status;
		float preco;
		
		Scanner leia = new Scanner(System.in);
		
		while(true){
			
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                   Mangá Store                       ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Adicionar Mangá                      ");
			System.out.println("            2 - Listar todos os mangás               ");
			System.out.println("            3 - Buscar mangá por Numero              ");
			System.out.println("            4 - Atualizar dados do mangá             ");
			System.out.println("            5 - Apagar mangá                         ");
			System.out.println("            0 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			
			try {
				opcao = leia.nextInt();
			}catch(InputMismatchException e) {
				System.err.println("Valor inválido, digite um valor inteiro!");
				leia.nextLine();
				opcao = 6;
			}
			
			if(opcao == 0) {
				System.out.println("Obrigada por visitar a Mangá Store!");
				sobre();
				leia.close();
				System.exit(0);
			}
			
			switch(opcao) {
				case 1 -> {
					System.out.println("Adicionar mangá\n\n");
					break;
				}
				
				case 2 -> {
					System.out.println("Listar todos os mangás\n\n");
					break;
				}
				
				case 3 -> {
					System.out.println("Buscar mangá por numero\n\n");
				}
				
				case 4 -> {
					System.out.println("Atualizar dados mangá\n\n");
				}
				
				case 5 -> {
					System.out.println("Excluir mangá\n\n");
				}
				
				default -> {
					System.out.println("Opçao inválida!\n");
					break;
				}
			}
			
		}

	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("                                                            ");
		System.out.println("Projeto Desenvolvido por: Beatriz Novais");
		System.out.println("https://github.com/triz14/projeto_final_bloco_01");
		System.out.println("                                                           ");
		System.out.println("***********************************************************");
	}

}
