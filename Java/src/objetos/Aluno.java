
package objetos;

public class Aluno {
    //Atributos
    private String nome;
    private String email;
    private int numero;
    
    //Metodos
    
    
 

    
    
    
    //Metodos Especiais

    public Aluno(String nome, String email, int numero) {
        this.nome = nome;
        this.email = email;
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }
    
    
    
    
    
}
