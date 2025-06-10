
package com.mycompany.javazoo;


public class Mamifero extends Animal {
    //Atributos
    protected String corPelo;
    
    //Metodos
    
    @Override
    public void locomover(){
        System.out.println("Correndo");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Mamando");
    }
    
    @Override
    public void fazerSom(){
        System.out.println("Som de mamifero");
    }
    
    //Metodos Especiais

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    
    
}
