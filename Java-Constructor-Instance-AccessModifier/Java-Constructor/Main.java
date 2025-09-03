public class Main {
    public static void main(String[] args) {
        System.out.println("=== Book Class Test ===");
        Book b1 = new Book();
        Book b2 = new Book("Java Programming", "James Gosling", 450.50);
        b1.display();
        b2.display();

        System.out.println("\n=== Circle Class Test ===");
        Circle c1 = new Circle();      // default constructor
        Circle c2 = new Circle(5.5);   // parameterized constructor
        System.out.println("Default Circle Area: " + c1.getArea());
        System.out.println("Circle with radius 5.5 Area: " + c2.getArea());

        System.out.println("\n=== Person Class Test ===");
        Person p1 = new Person("Alice", 25);
        Person p2 = new Person(p1);  // copy constructor
        p1.display();
        p2.display();

        System.out.println("\n=== Hotel Booking Test ===");
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("John Doe", "Deluxe", 3);
        HotelBooking h3 = new HotelBooking(h2);  // copy constructor
        h1.display();
        h2.display();
        h3.display();

        System.out.println("\n=== Library Book Test ===");
        LibraryBook lb1 = new LibraryBook("Data Structures", "Robert Lafore", 299.99);
        lb1.display();
        lb1.borrowBook();
        lb1.display();
        lb1.borrowBook(); // try borrowing again

        System.out.println("\n=== Car Rental Test ===");
        CarRental cr1 = new CarRental();
        CarRental cr2 = new CarRental("Emma", "SUV", 5);
        cr1.display();
        cr2.display();
    }
}
