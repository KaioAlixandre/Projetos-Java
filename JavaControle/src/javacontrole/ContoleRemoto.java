
package javacontrole;


public class ContoleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ContoleRemoto(){
        volume = 50;
        ligado = false;
        tocando = false;
    }
     private  int getVolume(){
        return volume;
    }
    private  void setVolume(int volume){
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        setLigado(true);
    }

    @Override
    public void delisgar() {
        setLigado(false);
        setTocando(false);
        setVolume(0);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado: "+ getLigado());
        System.out.println("Esta tocando: "+ getTocando());
        System.out.print("Volume: "+ getVolume());
        for (int cc = 0; cc < getVolume(); cc +=10){
            System.out.print(" |");
        }
        
    }

    @Override
    public void fecharMenu() {
        System.out.println("fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (getLigado()){
            this.volume = volume + 5;
        } else {
            System.out.println("Impossivel aumentar volume!");
        }
    }

    @Override
    public void menosVolume() {
        if (getLigado()){
            this.volume = volume - 5;
        }
    }

    @Override
    public void ligarMudo() {
        if (getLigado()){
            if (getVolume() > 0){
                setVolume(0);
            } else {
                System.out.println("ja esta mutado!");
            }
        }else {
            System.out.println("Impossivel mutar!");
        }
    }

    @Override
    public void desligarMudo() {
        if (getLigado() && getVolume() == 0){
            setVolume(50);
        } else {
            System.out.println("Impossivel desmultar");
        }
    }

    @Override
    public void play() {
        if (getLigado() && !(getTocando())){
            setTocando(true);
        } else {
            System.out.println("Impossivel da play!");
        }
    }

    @Override
    public void pause() {
        if (getLigado() && getTocando()){
            setTocando(false);
        } else {
            System.out.println("Impossivel pausar");
        }
    }
    
    
  
    
}
