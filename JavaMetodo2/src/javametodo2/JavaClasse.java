/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javametodo2;

/**
 *
 * @author kaioa
 */
public class JavaClasse {
    public static String contador (int i, int f){
        String s = "";
        for (int c = i; c <= f; c++){
            s += c + " ";
        }
        return s;
        
    }
    public static void soma (int a, int b){
        int s = a + b;
        System.out.println("A soma e " + s);
    }
}
