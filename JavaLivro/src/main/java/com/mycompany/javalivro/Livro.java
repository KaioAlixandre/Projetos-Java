
package com.mycompany.javalivro;


public class Livro implements Publicaçao {
    //Atributos
    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor; 
    
    //Metodos Especias

    public Livro(String titulo, String autor,int totPag, Pessoa l) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.leitor = l;
    }
    
    

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

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    
    //Metodos
    public void detalhes(){
        System.out.println("---------------------------");
        System.out.println("Nome do livro: "+ getTitulo());
        System.out.println("Escrito por: "+ getAutor());
        System.out.println("Esta sendo lido por "+ leitor.getNome());
    }

    @Override
    public void abrir() {
        this.aberto = true;
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void fechar() {
       if (getAberto() == true){
           this.aberto = false;
       } else {
           System.out.println("Livro ja esta fechado!");
       }
    }

    @Override
    public void folhear(int p) {
        if (p > this.totPag){
            this.pagAtual = 0;
        } else {
            setPagAtual(getPagAtual() + p);
        }
    }

    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual() - 1);
    }
    
}
