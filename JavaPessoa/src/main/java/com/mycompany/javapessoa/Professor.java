
package com.mycompany.javapessoa;


public class Professor extends Pessoa {
    //Atributos
    private String espc;
    private float sal;
    
    //Metodos
    
    public void recebAumt(float v){
        this.sal = sal + v;
    }
    public void status(){
        System.out.println("---------Professor----------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Materia: "+ getEspc());
        System.out.println("Salario: "+ getSal());
    }
    
    //Metodos Especiais

    public String getEspc() {
        return espc;
    }

    public void setEspc(String espc) {
        this.espc = espc;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
    
    
}
