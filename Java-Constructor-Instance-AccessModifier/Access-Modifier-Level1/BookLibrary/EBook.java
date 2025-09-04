

public class EBook extends Book {
    private double fileSize;

    public EBook(String ISBN, String title, String author, double fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }

    public void showDetails() {
        System.out.println("EBook: " + title + " (ISBN: " + ISBN + ", File Size: " + fileSize + "MB)");
    }
}
