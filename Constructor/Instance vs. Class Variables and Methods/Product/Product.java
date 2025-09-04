package Constructor.Instance vs. Class Variables and Methods.Product;
public class Product {
    // Instance variables
    String productName;
    double price;
    
    // Class variable (shared by all products)
    static int totalProducts = 0;
    // Constructor
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increase count whenever a new product is created
    }
    // Instance method - belongs to objects
    void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: " + price);
    }
    // Class method - belongs to class
    static void displayTotalProducts() {
        System.out.println("Total Products Created: " + totalProducts);
    }
}