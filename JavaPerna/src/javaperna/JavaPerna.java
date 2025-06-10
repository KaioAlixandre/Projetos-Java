/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaperna;

import java.util.Scanner;

/**
 *
 * @author kaioa
 */
public class JavaPerna {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        Scanner t = new Scanner (System.in);
        System.out.print("Quantas pernas o ser tem: ");
        int perna = t.nextInt();
        String tipo;
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bipedi";
                break;
            case 4:
                tipo = "Quadrupede";
                break;
            case 6, 8:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
        }
        System.out.printf("Seu tipo e %s", tipo);
        
    }
    
}
