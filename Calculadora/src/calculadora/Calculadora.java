/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import java.util.Scanner;


public class Calculadora {
    static int soma(int a, int b){
        int s = a + b;
        return s;
    }
    static int sub (int a, int b){
        int s = a - b;
        return s;
    }
    static int mult (int a, int b){
        int s = a * b;
        return s;
    }
    static int div (int a, int b){
        int s = a / b;
        return s;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);
        int resp;
        System.out.println("------Calculadora simples-----");
        System.out.println("[1]Para somar"
                + "[2]Para subtrair"
                + "[3]Para multiplicar"
                + "[4]Para dividir"
                + "[0]Para parar!");
           do {
            System.out.println("Escolha a forma de operacao: ");
            resp = t.nextInt();
               if (resp >= 1 && resp <= 4){
                System.out.print("Escolha o primeiro numero: ");
                int n1 = t.nextInt();
                System.out.print("Escolha o segumdo numero: ");
                int n2 = t.nextInt();
                switch(resp){
                    case 1:
                      int soma = soma(n1, n2); 
                        System.out.println("A soma dos dois numeros foi igual a: "+ soma);
                        break;
                    case 2:
                        int sub = sub(n1, n2);
                        System.out.println("A subtracao dos numeros foi igual a: "+ sub);
                        break;
                    case 3:
                        int mul = mult(n1, n2);
                        System.out.println("A multiplicacao dos numeros foi igual a: "+ mul);
                        break;
                    case 4:
                        int div = div(n1, n2);
                        System.out.println("A divisao dos numeros foi igual a: "+ div);
                        break;
                     }
                 } else {
                   System.out.println("Numero invalido! tente novamente.");
                 }
           } while(resp != 0); 

        System.out.println("Programa Finalizado!");
        t.close();
    }
    
}
