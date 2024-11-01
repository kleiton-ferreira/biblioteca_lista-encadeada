package structures;

import entities.Livro;

public class ListaEncadeada {
    
	private Node head;

    public void adicionarLivro(Livro livro) {
        Node novoNode = new Node(livro);
        if (head == null) {
            head = novoNode;
        } else {
            Node temp = head;
            while (temp.getProximo() != null) {
                temp = temp.getProximo();
            }
            temp.setProximo(novoNode);
        }
    }

    public void listarLivros() {
        if (head == null) {
            System.out.println("Desculpe! Não há livros para serem exibidos.");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.getLivro());
                temp = temp.getProximo();
            }
        }
    }

    public Livro buscarLivroPorTitulo(String titulo) {
        Node temp = head;
        while (temp != null) {
            if (temp.getLivro().getTitulo().equalsIgnoreCase(titulo)) {
                return temp.getLivro();
            }
            temp = temp.getProximo();
        }
        return null;
    }
    
    
    public void ordenarPorTitulo() {
        if (head == null || head.getProximo() == null) {
            // Lista vazia ou com apenas um elemento já está ordenada
            return;
        }

        boolean trocado;
        do {
            trocado = false;
            Node atual = head;
            Node proximo = head.getProximo();

            while (proximo != null) {
                // Comparar títulos dos livros
                if (atual.getLivro().getTitulo().compareToIgnoreCase(proximo.getLivro().getTitulo()) > 0) {
                    // Trocar os dados dos nós
                    Livro tempLivro = atual.getLivro();
                    atual.setLivro(proximo.getLivro());
                    proximo.setLivro(tempLivro);
                    trocado = true;
                }
                atual = proximo;
                proximo = proximo.getProximo();
            }
        } while (trocado);
        
    }

    public boolean removerLivroPorTitulo(String titulo) {
        if (head == null) {
            return false;
        }

        // Caso o livro a ser removido esteja no início da lista
        if (head.getLivro().getTitulo().equalsIgnoreCase(titulo)) {
            head = head.getProximo();
            return true;
        }

        Node atual = head;
        Node anterior = null;

        // Percorrer a lista para encontrar o livro
        while (atual != null && !atual.getLivro().getTitulo().equalsIgnoreCase(titulo)) {
            anterior = atual;
            atual = atual.getProximo();
        }

        // Se o livro não for encontrado
        if (atual == null) {
            return false;
        }

        // Remover o nó atual
        anterior.setProximo(atual.getProximo());
        return true;
    }
}
