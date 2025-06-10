
package objetos;

public class Triangulo {
    
    private double a;
    private double b;
    private double c;
    private String nome;

    public Triangulo(String n,double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.nome = n;
    }
    
    
    
    public void area(){
        double p = this.a + this.b + this.c / 2;
        double area = Math.sqrt(p * (p - this.a) *  (p - this.b) * (p - this.c));
        System.out.printf("A area do %s e %.4f%n",this.nome,area);
    }
    

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }



    
    
}
