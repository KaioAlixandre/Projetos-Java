
package javacontrole;


public class JavaControle {

  
    public static void main(String[] args) {
       ContoleRemoto c = new ContoleRemoto();
       c.ligar();
       c.play();
       c.maisVolume();
       c.maisVolume();
       c.menosVolume();
       c.pause();
       c.play();
       c.ligarMudo();
       c.desligarMudo();
       
       c.abrirMenu();
    }
    
}
