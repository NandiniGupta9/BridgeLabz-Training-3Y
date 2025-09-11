

public class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter
    public String getDetails() {
        return title + " by " + author;
    }
}
