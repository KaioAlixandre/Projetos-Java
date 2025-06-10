
package javauec;


public class JavaUEC {


    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Kaio", "Brasil", 19, 1.80f, 76.0f, 12, 3, 2);
        l[1] = new Lutador("Gabriel", "Alemanha", 20, 1.76f, 50.3f, 10, 4, 1);
        l[1].treinoPesado();
        
        Luta uec01 = new Luta();
        uec01.macarLuta(l[0], l[1]);
        uec01.lutar();
        
    }
    
}
