
package banco;

import java.util.Scanner;


public class Banco {


    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Conta c1 = new Conta();
        int resp;
        System.out.println("Quer abrir uma conta: ");
        resp = t.nextInt();
        if (resp == 1) {
            System.out.println("Nome: ");
            String n = t.next();
            c1.setDono(n);
            System.out.println("CPF: ");
            double c = t.nextDouble();
            c1.setNumConta((int) c);
            System.out.println("Qual tipo de conta quer abrir CC ou CP: ");
            String b = t.next();
            c1.abrirConta(b);
            System.out.println("Deposito inicial: ");
            int d = t.nextInt();
            c1.depositar(d);
            c1.status();
        } else {
            System.out.println("Tchau! Obrigado.");
        }
    }
    
}
