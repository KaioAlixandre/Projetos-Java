
package com.mycompany.javapessoa;


public class Visitante extends Pessoa {
    public void status(){
        System.out.println("-------Visitante-------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
    }
}
