/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javamedia;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kaioa
 */
public class JavaMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int num;
        int cont = 0 - 1;
        int soma = 0;
        int contP = 0;
        int contI = 0;
        int contA = 0;
        do {
           num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor: "));
           cont++;
           soma += num;
           if (num % 2 == 0){
              contP++; 
           } else {
               contI++;
           } if (num > 100) {
               contA++;
           }
        } while (num != 0);
        int media = soma / cont;
        JOptionPane.showMessageDialog(null, "<html>Tota de valore: <br>" + cont +
               "<br>Total de Pares: " + contP +
               "<br>Total de Impares: " + contI +
               "<br>Acima de 100: " + contA +
               "<br>Media dos valores: " + media);
        
     }
    
}
