package manga.repository;

import manga.model.Manga;

public interface MangaRepository {
	
	public void cadastrar(Manga manga);
	public void atualizar(Manga manga);
	public void deletar(int numero);
	public void procurarPorNumero(int numero);
	public void listarTodos();
}
