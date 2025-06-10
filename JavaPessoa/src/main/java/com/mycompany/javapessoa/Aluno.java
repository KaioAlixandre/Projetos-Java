
package com.mycompany.javapessoa;


public class Aluno extends Pessoa {
    //Atributos
    private boolean mtr;
    private String curso;
    private int numMTR;
    
    //Metodos
    
    public void cancelMtr(){
        this.mtr = false;
        this.numMTR = 0;
        System.out.println("Mtricula cancelada com sucesso!");
    }
    
    public void pagarMensalidade(){
        if (getMtr() == true){
            System.out.println("Mensalidade de"+ getNome()+"paga!");
        }    
    }
    
    public void status(){
        System.out.println("--------Aluno---------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Cursando: "+ getCurso());
        System.out.println("Matricula: "+ this.numMTR);
    }
    
    //Metodos Especiais

    public Aluno() {
        this.mtr = true;
    }
    
    

    public boolean getMtr() {
        return mtr;
    }

    public void setMtr(boolean mtr) {
        this.mtr = mtr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getNumMTR() {
        return numMTR;
    }

    public void setNumMTR(int numMTR) {
        this.numMTR = numMTR;
    }
    
    
    
    
}
