/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author kaioa
 */

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        System.out.println("Informe seu Sexo M/F: ");
        String sexo = teclado.next();
        System.out.println("Digite sua nota: ");
        float nota = teclado.nextFloat();
        System.out.printf("O seu nome e: %s \n", nome);
        System.out.printf("Voce tem %d: anos \n", idade);
        System.out.printf("Voce e do sexo: %s \n", sexo);
        System.out.printf("Sua nota foi de: %.2f \n", nota);
               
    }
    
}
