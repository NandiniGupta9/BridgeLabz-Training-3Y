

public class LibraryMain {
    public static void main(String[] args) {
        Book b1 = new Book("123-XYZ", "Java Basics", "James Gosling");
        b1.display();

        EBook eb = new EBook("456-ABC", "Advanced Java", "Oracle Team", 15.2);
        eb.showDetails();
    }
}
