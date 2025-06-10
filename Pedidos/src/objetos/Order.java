
package objetos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    
    private Cliente cliente;
    private List<Orderitem> orderItem = new ArrayList();
    
    public void addItem(Orderitem item){
        orderItem.add(item);
    }
    
    public void removeItem(Orderitem item){
        orderItem.remove(item);
    }
    
    public Double Total(){
        double tot = 0;
        for(Orderitem s : orderItem){
          tot += s.getPrice();
        }
        return tot;
    }

    public Order(Date moment, OrderStatus status, Cliente cliente) {
        this.moment = moment;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
