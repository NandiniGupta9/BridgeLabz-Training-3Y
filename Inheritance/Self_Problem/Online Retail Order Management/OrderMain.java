public class OrderMain {
    public static void main(String[] args) {
        
        Order order = new Order("ORD123", "2025-09-13");
        order.getOrderStatus();

        System.out.println();

       
        ShippedOrder shippedOrder = new ShippedOrder("ORD124", "2025-09-12", "TRK987654");
        shippedOrder.getOrderStatus();

        System.out.println();

        
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD125", "2025-09-10", "TRK123456", "2025-09-13");
        deliveredOrder.getOrderStatus();
    }
}


