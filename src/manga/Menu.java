package manga;

import java.util.InputMismatchException;
import java.util.Scanner;

import manga.controller.MangaController;
import manga.model.MangaGenero;

public class Menu {

	public static void main(String[] args) {
		
		MangaController mangas = new MangaController();
		
		//Criação mangás
		MangaGenero mg1 = new MangaGenero(mangas.gerarNumero(), "Solo Leveling", "Chu-Gong", "Finalizado",
											50.90f, "Fantasia/Ação");
		mangas.cadastrar(mg1);
		
		MangaGenero mg2 = new MangaGenero(mangas.gerarNumero(), "The Beginnig After The End", "TurtleMe", "Em andamento",
											60.00f, "Fantasia/Ação");
		mangas.cadastrar(mg2);
		
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
					
					System.out.println("Digite o nome do mangá: ");
					leia.nextLine();
					nome = leia.nextLine();
					
					System.out.println("Digite o autor do mangá: ");
					autor = leia.nextLine();
					
					System.out.println("Digite o status do mangá (Finalizado/Em andamento): ");
					status = leia.nextLine();
					
					System.out.println("Digite o preço do mangá (R$): ");
					preco = leia.nextFloat();
					
					System.out.println("Digite o gênero do mangá: ");
					genero = leia.nextLine();
					
					mangas.cadastrar(new MangaGenero(mangas.gerarNumero(), nome, autor, status, preco, genero));
					
					break;
				}
				
				case 2 -> {
					System.out.println("Listar todos os mangás\n\n");
					mangas.listarTodos();
					break;
				}
				
				case 3 -> {
					System.out.println("Buscar mangá por numero\n\n");
					
					System.out.println("Digite o número do mangá: ");
					numero = leia.nextInt();
					
					var manga = mangas.buscarNaCollection(numero);
					
					if(manga != null) {
						mangas.procurarPorNumero(numero);
					} else {
						System.out.println("o mangá não foi encontrado!");
					}
					
					break;
				}
				
				case 4 -> {
					System.out.println("Digite o número do mangá: ");
					numero = leia.nextInt();
					leia.nextLine();
					
					var buscaManga = mangas.buscarNaCollection(numero);
					
					System.out.println("Atualizar dados mangá\n\n");
					
					System.out.println("Digite o nome do mangá: ");
					nome = leia.nextLine();
					
					System.out.println("Digite o autor do mangá: ");
					autor = leia.nextLine();
					
					System.out.println("Digite o status do mangá (Finalizado/Em andamento): ");
					status = leia.nextLine();
					
					System.out.println("Digite o preço do mangá: ");
					preco = leia.nextFloat();
					
					System.out.println("Digite o gênero do mangá: ");
					genero = leia.nextLine();
					
					if(buscaManga != null) {
						mangas.atualizar(new MangaGenero(numero, nome, autor, status, preco, genero));
					} else {
						System.out.println("O mangá não foi encontrado!");
					}
					
					break;
				}
				
				case 5 -> {
					System.out.println("Excluir mangá\n\n");
					
					System.out.println("Digite o número do mangá: ");
					numero = leia.nextInt();
					mangas.deletar(numero);
					
					break;
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
