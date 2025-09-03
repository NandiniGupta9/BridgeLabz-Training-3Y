public class Main {
    public static void main(String[] args) {
        System.out.println("=== Problem 1: Product Inventory ===");
        Product p1 = new Product("Laptop", 55000);
        Product p2 = new Product("Smartphone", 25000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();

        System.out.println("\n=== Problem 2: Online Course Management ===");
        Course c1 = new Course("Java Full Stack", 12, 15000);
        Course c2 = new Course("Data Structures", 8, 10000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        Course.updateInstituteName("OpenAI Academy");
        c1.displayCourseDetails();
        c2.displayCourseDetails();

        System.out.println("\n=== Problem 3: Vehicle Registration ===");
        Vehicle v1 = new Vehicle("Alice", "Car");
        Vehicle v2 = new Vehicle("Bob", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(750.0);
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

