
package com.mycompany.javazoo;


public class Peixe extends Animal {
    //Atributos
    protected String corEscama;
    
    //Metodos
    
    public void soltarBolhas(){
        
    }
    
    @Override
    public void locomover(){
        System.out.println("Nadar");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Comer Algas");
    }
    
    @Override
    public void fazerSom(){
        System.out.println("Peixe nao faz som");
    }
            
            
            
    
    //Metodos Especiais

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    
    
}
