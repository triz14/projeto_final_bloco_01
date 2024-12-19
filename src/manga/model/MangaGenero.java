package manga.model;

public class MangaGenero extends Manga {

	private String genero;

	public MangaGenero(int numero, String nome, String autor, String status, float preco, String genero) {
		super(numero, nome, autor, status, preco);
		this.genero = genero;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Gênero: " + this.genero);
	}

}
