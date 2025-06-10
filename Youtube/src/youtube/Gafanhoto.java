
package youtube;

public class Gafanhoto extends Pessoa {
    //Atributos
    private String login;
    private int totAssistido;
    
    //Metodos 
    
    public void viuMaisUm(){
        
    }
    
    public void status(){
        System.out.println("-------Gafanhoto------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Total assistidos: "+ getTotAssistido());
    }
    
    //Metodos Especias

    public Gafanhoto(String nome, int idade, String sexo, String login) {
        this.setNome(nome);
        this.setIdade(idade);
        this.setSexo(sexo);
        this.setLogin(login);
    }
    
    

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    
    
}
