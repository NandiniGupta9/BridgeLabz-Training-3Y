

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    String email;
    List<Order> orders;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order o) {
        orders.add(o);
        System.out.println(name + " placed Order " + o.orderId);
    }

    public void showOrders() {
        System.out.println("\nCustomer: " + name + " | Email: " + email);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}
