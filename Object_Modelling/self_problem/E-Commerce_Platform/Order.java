

import java.util.ArrayList;
import java.util.List;

public class Order {
    int orderId;
    List<Product> products;
    Customer customer;

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
        System.out.println("Added " + p.productName + " to Order " + orderId);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        return total;
    }

    public void showOrderDetails() {
        System.out.println("\nOrder ID: " + orderId + " | Customer: " + customer.name);
        System.out.println("Products:");
        for (Product p : products) {
            p.showDetails();
        }
        System.out.println("Total: " + calculateTotal());
    }
}
