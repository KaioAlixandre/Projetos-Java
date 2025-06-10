/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instagram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import objetos.Comentarios;
import objetos.Post;

/**
 *
 * @author kaioa
 */
public class Instagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comentarios coment1 = new Comentarios("Eu tenho uma ideia");
        Comentarios coment2 = new Comentarios("Wow que incrivel");
        
        Post post1 = new Post(sdf.parse("13/06/2018 13:45:33"), "Viajando para Nova Zelandia", "estou indo visitar este lindo pais", 12);
        post1.addComentario(coment1);
        post1.addComentario(coment2);
        
        Post p1 = new Post(sdf.parse("28/07/2018 23:14:19"), "Boa noite galera", "Vejo voces amanha", 5);
        Comentarios c1 = new Comentarios("Boa noite");
        Comentarios c2 = new Comentarios("Que a força esteja com voce");
        p1.addComentario(c1);
        p1.addComentario(c2);
        
        System.out.println(post1.getTitulo());
        System.out.println(post1.getLikes()+" Likes - "+ post1.getMomento());
        System.out.println(post1.getConteudo());
        System.out.println("Comentarios: ");
        System.out.println(coment1.getText());
        System.out.println(coment2.getText());
        System.out.println("");
        System.out.println(p1.getTitulo());
        System.out.println(p1.getLikes()+" Likes - "+ p1.getMomento());
        System.out.println(p1.getConteudo());
        System.out.println("Comentarios: ");
        System.out.println(c1.getText());
        System.out.println(c2.getText());
    }
    
}
