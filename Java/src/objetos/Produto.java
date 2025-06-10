
package objetos;

public class Produto {
    //Atributos
    private String name;
    private double price;

    public Produto(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    
    
   /* private int quant;
   
    
    //Metodos
    
    public void addProducts(String n, int q, double p){
        this.name = n;
        this.quant = q;
        this.price = p;
    }
    
    public void removeProducts(){
        this.name = null;
        this.price = 0;
        this.quant = 0;
    }
    
    public double TotValueInStock(){
        double tot = getPrice() * getQuant();
        return tot;
    }
    
    public void addQuantity(int q){
        this.quant += q;
    }
    
    public void removeQuantity(int q){
        this.quant -= q;
    }
    
    //Metodos Especiais

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
}
