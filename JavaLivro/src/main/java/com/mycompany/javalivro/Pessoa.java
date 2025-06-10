
package com.mycompany.javalivro;


public class Pessoa {
    //Atributos
    
    private String nome;
    private String sexo;
    private int idade;
    
    //Metodos especiais

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }
    
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //Metodos
    
    public void fazerAniversario(){
        setIdade(getIdade() + 1);
    }
}
