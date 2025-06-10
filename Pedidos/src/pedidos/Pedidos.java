
package pedidos;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import objetos.Cliente;
import objetos.Order;
import objetos.OrderStatus;
import objetos.Orderitem;
import objetos.Produto;
public class Pedidos {

    public static void main(String[] args) throws ParseException {
        Scanner t = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date data = new Date();
        
        System.out.println("Insira os dados do cliente:");
        System.out.print("Nome: ");
        String nome = t.next();
        System.out.print("Email: ");
        String email = t.next();
        System.out.print("Data de Aniversario (DD/MM/YYYY): ");
        Date ani = sdf.parse(t.next());
        Cliente cliente = new Cliente(nome, email, ani);
        
        System.out.println("Insira os dados do pedido:");
        System.out.print("Status: ");
        String sta = t.next();
        System.out.print("Quantos itens tem no pedido?: /n");
        int qnt = t.nextInt();
        
        Order order = new Order(data, OrderStatus.valueOf(sta), cliente);
        Orderitem[] oI = new Orderitem[qnt];
        Produto[] produto = new Produto[qnt];
        
        for (int i = 0; i < qnt; i++) {
            System.out.println("Insira os dados do primeiro pedido:");
            System.out.print("Nome do produto: ");
            String nP = t.next();
            System.out.print("Preco do Produto: ");
            Double preco = t.nextDouble();
            System.out.println("Quantidade: ");
            Integer qntP = t.nextInt();
            produto[i] = new Produto(nP, preco);
            oI[i] = new Orderitem(qntP, preco, produto[i]);
            order.addItem(oI[i]);
        }
        
        System.out.println("ORDER SUMMARY:");
        System.out.println("Order moment: "+ order.getMoment());
        System.out.println("Order status: "+ order.getStatus());
        System.out.println("Client: "+ cliente.getNome() +" "+ cliente.getBirthDate() +" - "+ cliente.getEmail());
        System.out.println("Order Items:");
        
        for (int i = 0; i < qnt; i++) {
            double subtot = oI[i].subTotal();
            System.out.println(produto[i].getNome() +", "+ produto[i].getPreco() +", Quantidade: "+ oI[i].getQuantity() +", Subtotal: "+ subtot);
        }
        
        double tot = order.Total();
        System.out.println("Total price: "+ tot);
       
        t.close();
    }
    
}
