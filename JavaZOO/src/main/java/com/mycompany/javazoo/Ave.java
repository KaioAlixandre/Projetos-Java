
package com.mycompany.javazoo;


public class Ave extends Animal{
    //Atributos
    protected String corPena;
    
    //Metodos
    
    public void fazerNinho(){
        
    }
    
    @Override
    public void locomover(){
        System.out.println("Voando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comendo frutinhas");
    }
    
    @Override
    public void fazerSom(){
        System.out.println("Som de ave");
    }
    
    //Metodos Especiais

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    
}
