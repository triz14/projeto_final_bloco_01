package manga.model;

public abstract class Manga {

	private int numero;
	private String nome;
	private String autor;
	private String status;
	private float preco;

	public Manga(int numero, String nome, String autor, String status, float preco) {
		this.numero = numero;
		this.nome = nome;
		this.autor = autor;
		this.status = status;
		this.preco = preco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void visualizar() {
		System.out.println("********************************************");
		System.out.println("Dados do mangá");
		System.out.println("********************************************");
		System.out.println("Numero mangá: " + this.numero);
		System.out.println("Nome: " + this.nome);
		System.out.println("Autor: " + this.autor);
		System.out.println("Status: " + this.status);
		System.out.println("Preço: " + this.preco);
	}

}
