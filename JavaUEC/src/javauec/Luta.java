
package javauec;

import java.util.Random;


public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public Luta() {
        this.aprovada = false;
    }
    
    public void macarLuta(Lutador l1, Lutador l2){
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2){
            this.desafiado = l1;
            this.desafiante = l2;
            setAprovada(true);
            System.out.println("Luta marcada com sucesso!");
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
        
    }
    public void lutar(){
        if (isAprovada()){
            System.out.println("### Desafiado ###");
            this.desafiado.apresentar();
            System.out.println("### Desafiante ###");
            this.desafiante.apresentar();
            
            Random ale = new Random();
            int ven = ale.nextInt(3);
            switch(ven){
                case 0:
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println(this.desafiado +" Ganhou!");
                    this.desafiado.ganharLuta();
                    this.desafiante.pederLuta();
                    break;
                case 2:
                    System.out.println(this.desafiante+ " Ganhou!");
                    this.desafiado.pederLuta();
                    this.desafiante.ganharLuta();
                    break;
            }
                    
        } else {
            System.out.println("Luta nao pode acontecer!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}

