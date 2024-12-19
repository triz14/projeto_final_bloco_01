package manga.controller;

import java.util.ArrayList;
import manga.model.Manga;
import manga.repository.MangaRepository;

public class MangaController implements MangaRepository{
	
	private ArrayList<Manga> listaMangas= new ArrayList<Manga>();
	int numero;

	@Override
	public void cadastrar(Manga manga) {
		listaMangas.add(manga);
		System.out.println("\nO mangá de número: " + manga.getNumero() + " foi adicionado com sucesso!");
	}

	@Override
	public void atualizar(Manga manga) {
		var buscaManga = buscarNaCollection(manga.getNumero());
		
		if(buscaManga != null) {
			listaMangas.set(listaMangas.indexOf(buscaManga), manga);
			System.out.println("\nO mangá de número: " + manga.getNumero() + " foi atualizado com sucesso!");
		} else {
			System.out.println("\nO mangá de número: " + manga.getNumero() + " não foi encontrado!");
		}
	}

	@Override
	public void deletar(int numero) {
		var manga = buscarNaCollection(numero);
		
		if (manga != null) {
				listaMangas.remove(numero);
				System.out.println("\nO mangá de número: " + manga.getNumero() + " foi removido!");
		} else{
			System.out.println("\nO mangá de número: " + numero + " não foi encontrado!");
		}	
	}

	@Override
	public void procurarPorNumero(int numero) {
		var manga = buscarNaCollection(numero);
		
		if(manga != null) {
			manga.visualizar();
		} else {
			System.out.println("\nO mangá de número: " + manga.getNumero() + " não foi encontrado!");
		}
	}

	@Override
	public void listarTodos() {
		for(var manga : listaMangas) {
			manga.visualizar();
		}
	}
	
	public int gerarNumero() {
		return ++numero;
	}
	
	public Manga buscarNaCollection(int numero) {
		for(var manga : listaMangas) {
			if(manga.getNumero() == numero) {
				return manga;
			}
		}
		return null;
	}

}
