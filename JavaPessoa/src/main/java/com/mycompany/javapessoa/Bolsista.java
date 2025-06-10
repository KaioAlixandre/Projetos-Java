
package com.mycompany.javapessoa;


public class Bolsista extends Aluno {
    //Atributos
    private int bolsa;
    
    //Metodos
    
    public void renovarBolsa(){
        this.bolsa = 0;
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(getNome() +" e bolsista! Pagamento facilitado");
    }
    
    @Override
    public void status(){
        System.out.println("-------Bolsista-------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Curso: "+ getCurso());
        System.out.println("Matricula: "+ getNumMTR());
        System.out.println("Tem bolsa de "+ getBolsa()+" %");
    }
    
    //Metodos Especiais

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
    
}
