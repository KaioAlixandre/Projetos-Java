
package javaventilador;

import java.util.Scanner;


public class Ventilador {
    String cor;
    int elices;
    int velocidade;
    int altura;
    String marca;
    boolean ligado = false;
    
    void status(){
        System.out.println("O ventilador esta desligado!");
    }
    
    void ligar(){
        Scanner t = new Scanner(System.in);
        this.ligado = true;
        System.out.print("Qual a velocidade quer ligar?");
        int v = t.nextInt();
        if (v > 0){
            System.out.println("Agora ele esta ligado na velocidade "+ v);
        } else {
            System.out.println("Erro! Nao esta ligado");
        }
    }
    void desligar(){
        this.ligado = false;
    }
    
    
}
