package entities;

public class Livro {
	
    private String titulo;
    private String autor;
    private int anoPublicacao;

    // Construtor ; 
    
    public Livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    // Getters e Setters ; 

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

    // ToString ; 
	
    @Override
    public String toString() {
        return "Livro [Título: " + titulo + ", Autor: " + autor + ", Ano: " + anoPublicacao + "]";
    }

}
