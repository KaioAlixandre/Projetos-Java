

package com.mycompany.javapessoa;


public class JavaPessoa {

    public static void main(String[] args) {
    Aluno a1 = new Aluno();
        a1.setNome("Kaio");
        a1.setIdade(19);
        a1.setSexo("M");
        a1.setCurso("Direito");
        a1.setNumMTR(202303677);
        a1.status(); 
        
    Visitante v1 = new Visitante();
        v1.setNome("Lucas");
        v1.setIdade(16);
        v1.setSexo("M");
        v1.status();
        
    Bolsista b1 = new Bolsista();
        b1.setNome("Gabriel");
        b1.setIdade(19);
        b1.setSexo("M");
        b1.setCurso("Ciencia da Computaçao");
        b1.setNumMTR(2023026);
        b1.setBolsa(100);
        b1.status();
    }
}
