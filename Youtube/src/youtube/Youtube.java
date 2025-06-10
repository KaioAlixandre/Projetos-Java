
package youtube;

public class Youtube {

    public static void main(String[] args) {
        Video v[] = new Video[2];
            v[0] = new Video("Como fritar um ovo, rapido e facil!");
            v[1] = new Video("GamePlay de Minecraft"); 
            v[0].play();
            v[0].like();
            v[0].status();
            
        Gafanhoto g[] = new Gafanhoto[2];
            g[0] = new Gafanhoto("Kaio", 19, "Masculino", "Neext");
            g[1] = new Gafanhoto("Lucas", 16, "Masculino", "Nego");
            g[1].viuMaisUm();
            g[1].status();
            
    }
    
}
