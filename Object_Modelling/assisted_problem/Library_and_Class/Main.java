

public class Main {
    public static void main(String[] args) {
        // Create independent books
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        Book book3 = new Book("Effective Java", "Joshua Bloch");

        // Create libraries
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");

        // Add books to libraries
        lib1.addBook(book1);
        lib1.addBook(book2);

        lib2.addBook(book2); // same book can be in multiple libraries
        lib2.addBook(book3);

        // Show library contents
        lib1.showBooks();
        lib2.showBooks();
    }
}

