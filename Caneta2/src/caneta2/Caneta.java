
package caneta2;

public class Caneta {
    String cor;
    public String modelo;
    private int ponta;
    private boolean tampada;
    
    public  Caneta(String c, String m, int p){
        tampar();
        this.cor = c;
        this.modelo = m;
        this.ponta = p;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
        
    }
    public int getPonta(){
        return this.ponta;
    }
    public void setPonta(int p){
        this.ponta = p;
    }
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("O modelo: " + this.modelo);
        System.out.println("A ponta: "+ this.ponta);
        System.out.println("Cor: "+ this.cor);
        System.out.println("Esta tampada "+ this.tampada);
    }
    public void tampar(){
        this.tampada = true;
    }
    
}
