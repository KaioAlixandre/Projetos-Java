/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javateste;

import java.util.Scanner;

/**
 *
 * @author kaioa
 */
public class JavaTeste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int n1 = t.nextInt();
        int n2 = t.nextInt();
        int soma = n1+n2;
        System.out.println("Resultado: "+ soma);
        if (soma > 18) {
            System.out.println("Voce pode se alistar no exercito");
        } else {
            System.out.println("Voce nao pode ainda");
        }
              
    }
    
}
