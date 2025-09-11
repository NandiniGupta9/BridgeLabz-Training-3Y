

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in the library
    public void showBooks() {
        System.out.println("Library: " + name);
        for (Book b : books) {
            System.out.println(" - " + b.getDetails());
        }
    }
}

