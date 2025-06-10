
package com.mycompany.javazoo;


public abstract class Animal {
    //Atributos
    protected int peso;
    protected int idade;
    protected int membros;
    
    //Metodos
    
    public void locomover(){
        
    }
    
    public void alimentar(){
        
    }
    
    public void fazerSom(){
        
    }
    
    //Metodos Especiais

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
    
}
