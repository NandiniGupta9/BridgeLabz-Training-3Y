public class TransportMain {
    public static void main(String[] args) {
        
        Car car = new Car(180, "Petrol", 5);
        Truck truck = new Truck(120, "Diesel", 15);
        Motorcycle motorcycle = new Motorcycle(150, "Petrol", true);

       
        Vehicle[] vehicles = {car, truck, motorcycle};

        
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}

