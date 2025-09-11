

public class Main {
    public static void main(String[] args) {
        // Create some products
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Mouse", 1500);
        Product p3 = new Product("Keyboard", 2500);

        // Create customer
        Customer c1 = new Customer("Alice", "alice@example.com");

        // Create order and add products
        Order order1 = new Order(101, c1);
        order1.addProduct(p1);
        order1.addProduct(p2);

        // Customer places order
        c1.placeOrder(order1);

        // Create second order for the same customer
        Order order2 = new Order(102, c1);
        order2.addProduct(p3);
        c1.placeOrder(order2);

        // Show all orders of the customer
        c1.showOrders();
    }
}
