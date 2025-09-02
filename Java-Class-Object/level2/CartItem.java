
import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " | Price: " + price + " | Quantity: " + quantity + " | Total: " + getTotalCost());
    }

    public static void main(String[] args) {
        ArrayList<CartItem> cart = new ArrayList<>();

        cart.add(new CartItem("Laptop", 45000, 1));
        cart.add(new CartItem("Mouse", 1500, 2));

        double total = 0;
        System.out.println("Cart Items:");
        for (CartItem item : cart) {
            item.displayItem();
            total += item.getTotalCost();
        }

        System.out.println("Total Cart Value: " + total);
    }
}
