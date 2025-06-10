
package caneta;


public class CanetaA {
    public String cor;
    private double espesura;
    int tamanho;
    public String modelo;
    protected int carga;
    protected boolean tampada;
    
    public void status (){
        System.out.println("Uma caneta: "+ cor);
        System.out.println("De espesura: "+ espesura + "m");
        System.out.println("De tamanho: "+ tamanho + "cm");
        System.out.println("Seu modelo: "+ modelo);
        System.out.println("Sua carga: "+ carga + "%");
        System.out.println("Esta tampada "+ tampada);
    }
    
    public void escrever(){
        if(this.tampada == true){
            System.out.println("Erro");
        } else {
            System.out.println("Ola, Mundo!");
        }
    }
    private void tampar (){
        this.tampada = true;
    }
    private void destampar(){
        this.tampada = false;
    }
}
