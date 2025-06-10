
package youtube;

public class Video implements AcoesVideo {
    //Atributos
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;
    
    //Metodos

    @Override
    public void play() {
        this.reproduzindo = true;
        
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }
    
    public void status(){
        System.out.println("--------Video---------");
        System.out.println("Titulo: "+ getTitulo());
        System.out.println("Avaliacao: "+ getAvaliacao());
        System.out.println("Vizualisacoes: "+ getViews());
        System.out.println("Curtidas: "+ getCurtidas());
        System.out.println("Play: "+ getReproduzindo());
    }
    
    //Metodos Especiais

    public Video(String titulo) {
        this.reproduzindo = false;
        this.titulo = titulo;
        this.avaliacao = 1;
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean getReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
    
    
}
