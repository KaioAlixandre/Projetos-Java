
package javaapplication42;


public abstract class Animal {
    //Atributos
    protected float peso;
    protected int idade;
    protected int membros;
    
    //Metodos
    
    public void emitirSom(){
        
    }
    
    //Metodos Especiais

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    
}
