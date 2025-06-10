/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javavetor;

import java.util.Arrays;

/**
 *
 * @author kaioa
 */
public class JavaVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /*String mes[] = {"jan","Fev","Mar","Abr","Mai","Jun","Jul"
                        ,"Ago","Set","Out","Nov","Dez"}; 
        int tot[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};        
        for (int c = 0; c<=12; c++) {
           System.out.println("O mes de " + mes[c] + " tem " + tot[c] + " dias ao todo");
        }*/
        /*int n[] = {3, 7, 9, 5, 2};
         int p = Arrays.binarySearch(n, 9);
        for (int valor : n) {
            System.out.print(valor+" ");
        }
        System.out.println("Encontrei o valor na posiçao " + p);*/
        int n[] = new int[15];
        Arrays.fill(n, 34);
        for (int valor: n){
            System.out.print(valor + " ");
        }
    }
    
}
