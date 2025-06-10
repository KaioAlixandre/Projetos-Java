

package com.mycompany.javalivro;


public class JavaLivro {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Kaio", "M", 20);
        Livro l1 = new Livro("Pequeno principe", "Machado de Assis", 200, p1);
        l1.detalhes();
        l1.abrir();
        l1.avancarPag();
        l1.avancarPag();
        l1.avancarPag();
        l1.folhear(150);
        System.out.println("Pagina atual: "+ l1.getPagAtual());
        
        Pessoa p2 = new Pessoa("Maria", "F", 23);
        Livro l2 = new Livro("A Moreninha", "Dom Casmurro", 300, p2);
        l2.detalhes();
        System.out.println("Pagina atual: "+ l2.getPagAtual());
    }
}
