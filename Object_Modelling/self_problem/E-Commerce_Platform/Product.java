


public class Product {
    String productName;
    double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void showDetails() {
        System.out.println("Product: " + productName + " | Price: " + price);
    }
}
