package Practice_Problems.Library Management System;
public class BookMain {
    public static void main(String[] args) {
        // Set the library name (static variable)
        Book.setLibraryName("Egmore Library");
        // Display the library name
        Book.displayLibraryName();
        // Create a new book instance
        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991");
        // Display book details
        if (book1 instanceof Book) {
            book1.displayBookDetails();
        }
    }
}