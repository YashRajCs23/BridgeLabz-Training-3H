package Constructor.Access Modifiers.LibraryManagement;
public class BookMain {
     public static void main(String[] args) {
        Book b1 = new Book("978-0134685991", "Effective Java", "Joshua Bloch");
        b1.displayBookDetails();
        // Access ISBN directly (public)
        
        System.out.println("Access ISBN directly: " + b1.ISBN);
        // Access author only via getter/setter
        System.out.println("Author (via getter): " + b1.getAuthor());
        b1.setAuthor("J. Bloch");
        System.out.println("Updated Author (via getter): " + b1.getAuthor());
        // Create EBook object (subclass)
        EBook eb1 = new EBook("978-1492078005", "Learning Java", "Marc Loy", 5.6);
        eb1.displayEBookDetails();
    }
}