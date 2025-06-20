
package objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private Date momento;
    private String titulo;
    private String conteudo;
    private Integer likes;

    public Post(Date momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }
    
    
    
    private List<Comentarios> coments = new ArrayList();
    
    public void addComentario(Comentarios e){
        coments.add(e);
    }

    public Date getMomento() {
        return momento;
    }

    public void setMomento(Date momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    
    
}
