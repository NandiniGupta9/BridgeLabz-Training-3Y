


// Book class
class Book {
    // Static variable shared across all instances
    private static String libraryName;

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // Final variable ensures immutability

    // Constructor using 'this' to avoid ambiguity
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to set the library name
    public static void setLibraryName(String name) {
        libraryName = name;
    }

    // Static method to display the library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        // Using 'instanceof' to verify object type
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("The object is not an instance of the Book class.");
        }
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
}

// Library class (main method)
public class Library {
    public static void main(String[] args) {
        // Set the library name
        Book.setLibraryName("Egmore Library");

        // Display the library name
        Book.displayLibraryName();

        // Create a new book instance
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");

        // Display book details
        book1.displayBookDetails();
    }
}
