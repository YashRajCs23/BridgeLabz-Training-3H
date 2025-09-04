package Constructor.Access Modifiers.LibraryManagement;
public class Book {
    // Public: accessible everywhere
    public String ISBN;
    // Protected: accessible within package and subclasses
    protected String title;
    
    // Private: accessible only inside this class
    private String author;
    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    // Public getter for author (to access private variable)
    public String getAuthor() {
        return author;
    }
    // Public setter for author
    public void setAuthor(String author) {
        this.author = author;
    }
    // Instance method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + author);
    }
}
// Subclass
class EBook extends Book {
    double fileSizeMB;
    public EBook(String ISBN, String title, String author, double fileSizeMB) {
        super(ISBN, title, author);
        this.fileSizeMB = fileSizeMB;
    }
    // Method to demonstrate access to public & protected members
    public void displayEBookDetails() {
        // ISBN -> public (accessible)
        // title -> protected (accessible)
        // author -> private (NOT accessible directly, use getter)
        System.out.println("EBook ISBN: " + ISBN +
                           ", Title: " + title +
                           ", Author: " + getAuthor() +
                           ", File Size: " + fileSizeMB + "MB");
    }
}