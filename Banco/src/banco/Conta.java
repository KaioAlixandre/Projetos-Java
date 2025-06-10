
package banco;

import java.util.Scanner;

public class Conta {
    public double numConta;
    String dono;
    private String tipo;
    private int saldo;
    private boolean status;

    public Conta() {
        this.status = false;
        saldo = 0;
    }
    
    
    
    public void abrirConta (String t){
        this.status = true;
        setTipo(t);
        if (getTipo() == "CC"){
            saldo = 50;
        } else {
            saldo = 150;
        }
        System.out.println("Conta de " + this.dono + " aberta com sucesso!");
    }
    public void fecharConta(){
        if (saldo == 0){
            this.status = false;
            System.out.println("Conta fechada com sucesso!");
        } else {
            System.out.println("impossivel fechar conta");
        }    
    }

    public void depositar(int v) {
        if (status == true){
            saldo = saldo + v;
            System.out.println("Depossito feito na conta de " + this.dono);
        } else {
            System.out.println("impossivel depositar!");
        }
    }

    public int Sacar(int v) {
        if (status == true){
            if (saldo >= v){
                saldo = saldo - v;
                System.out.println("Saque realizado na conta de " + this.dono);
            } else {
                System.out.println("saldo insulficiente!");
            }
             
        } else {
            System.out.println("impossivel sacar!");
        } 
        return this.saldo;
    }

    public void pagarMensal(){
        int v;
        if (tipo == "CC"){
            v = 12;
        } else {
            v =  20;
        } if (status == true){
            if (saldo > v){
                saldo = saldo - v;
            } else {
                System.out.println("Impossivel pagar! Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }
    public void status(){
        System.out.println("----------------------");
        System.out.println("Numero da conta: "+getNumConta());
        System.out.println("Dono: "+ getDono());
        System.out.println("Saldo: "+ getSaldo());
        System.out.println("Tipo da conta: "+ getTipo());
        System.out.println("----------------------");
    }

    public double getNumConta() {
        return numConta;
    }

    public String getDono() {
        return dono;
    }

    public String getTipo() {
        return tipo;
    }

    public int getSaldo() {
        return saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
    
}
