
package com.mycompany.javazoo;


public class Reptil extends Animal {
    //Atributos
    protected String corEscama;
    
    //Metodos
    
    @Override
    public void locomover(){
        System.out.println("Rastejando");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comer insetos");
    }
    
    @Override
    public void fazerSom(){
        System.out.println("Som de reptil");
    }
    
    //Metodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
}
