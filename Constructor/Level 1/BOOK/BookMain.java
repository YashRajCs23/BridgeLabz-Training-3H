package Constructor.Level 1.BOOK;
public class BookMain {
    public static void main(String[] args) {
        
        Book b1 = new Book();  // default constructor
        Book b2 = new Book("Java Programming", "James Gosling", 550.75); // parameterized
        b1.display();
        b2.display();
    }
}