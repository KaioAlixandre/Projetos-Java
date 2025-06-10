
package aulaenumeracao;

import java.util.Date;
import objetos.Order;
import objetos.OrderStatus;

public class AulaEnumeracao {

    public static void main(String[] args) {
        Order order = new Order(29, new Date(), OrderStatus.ENVIADO);
        System.out.println(order.getId()+ ", "+ order.getMoment() +", "+ order.getStatus());
    }
    
}
