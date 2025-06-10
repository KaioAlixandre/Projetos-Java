
package objetos;

public class Orderitem {
    private Integer quantity;
    private Double price;
    
    private Produto product;
    
    public Double subTotal(){
        this.price = product.getPreco() * this.quantity;
        return price;
    }

    public Orderitem(int quantity, double price, Produto product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }
    

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
}
