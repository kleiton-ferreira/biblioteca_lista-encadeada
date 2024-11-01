package application;

import java.util.Scanner;

import entities.Livro;
import structures.ListaEncadeada;

public class Program {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(
            		"\nACERVO DE LIVROS\n" +
            
            		"\nESCOLHA UMA OPÇÃO" +
            		"\n1. Adicionar Livro" +
            		"\n2. Listar Livros" +
            		"\n3. Buscar por Título" +
            		"\n4. Ordenar Livros por Título" +
            		"\n5. Remover por Título" +
            		"\n6. Sair"
            		);
        
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de Publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine();
                    lista.adicionarLivro(new Livro(titulo, autor, ano));
                    break;
                case 2:
                    lista.listarLivros();
                    break;
                case 3:
                    System.out.print("Título para buscar: ");
                    String buscaTitulo = scanner.nextLine();
                    Livro livroEncontrado = lista.buscarLivroPorTitulo(buscaTitulo);
                    if (livroEncontrado != null) {
                        System.out.println("Livro encontrado: " + livroEncontrado);
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
               
                case 4:
                	lista.ordenarPorTitulo();
                	System.out.println("Livros ordenados por título");
                    lista.listarLivros();
                	break;
                    
                case 5:
                    System.out.print("Título para remover: ");
                    String tituloRemover = scanner.nextLine();
                    boolean removido = lista.removerLivroPorTitulo(tituloRemover);
                    if (removido) {
                        System.out.println("Livro removido com sucesso.");
                    } else {
                        System.out.println("Livro não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
