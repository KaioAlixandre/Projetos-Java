
package com.mycompany.javapessoa;


public class Funcionario extends Pessoa{
    //Atributos
    private String setor;
    private boolean trabalhando;
    
    //Metodos
    
    public void mudTrabalho(String t){
        this.setor = t;
    }
    
    public void status(){
        System.out.println("----------Funcionario-----------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Setor: "+ getSetor());
        
    }
    
    //Metodos Especias

    public Funcionario() {
        this.trabalhando = true;
    }
    
    

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
