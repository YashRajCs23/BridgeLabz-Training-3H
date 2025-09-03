package Constructor.Level 1.LibraryBook;
public class LibraryBook {
    
    String title;
    String author;
    double price;
    boolean isAvailable;
    public LibraryBook(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = true; // By default, book is available
    }
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + isAvailable);
    }
}