package structures;

import entities.Livro;

public class Node {
	
    private Livro livro;
    private Node proximo;

    // Construtor ; 
    
    public Node(Livro livro) {
        this.livro = livro;
        this.proximo = null;
    }

    // Getters e Setters ; 
    
	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
}

