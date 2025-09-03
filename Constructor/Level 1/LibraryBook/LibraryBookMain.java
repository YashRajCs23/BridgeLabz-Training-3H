package Constructor.Level 1.LibraryBook;
public class LibraryBookMain {
    public static void main(String[] args) {
        
        LibraryBook lb1 = new LibraryBook("Clean Code", "Robert C. Martin", 499.0);
        lb1.display();
        lb1.borrowBook();
        lb1.display();
        lb1.borrowBook(); // Try borrowing again
    }
}