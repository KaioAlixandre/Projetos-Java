
package youtube;

public class Visualizacao {
   //Atributos
    private Gafanhoto espectador;
    private Video filme;
    
    //Metodos
    
    public void avaliar(){
        
    }
    
    public void avaliar(int n){
        
    }
    
    public void avaliar(float p){
        
    }
    
    //Metodos Especiais

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }
    
    

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }
    
    
}
