
package com.mycompany.javapessoa;

public abstract class Pessoa {
    //Atributos
    private String nome;
    private String sexo;
    private int idade;
    
    //Metodos
    
    public void fazerAniver(){
        setIdade(getIdade() + 1);
    }
    
    //Metodos especiais

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
    
}
