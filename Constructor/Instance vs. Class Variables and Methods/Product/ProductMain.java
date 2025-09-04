package Constructor.Instance vs. Class Variables and Methods.Product;
public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 75000);
        Product p2 = new Product("Smartphone", 30000);
        Product p3 = new Product("Headphones", 2500);
        
        // Display details of each product (instance method)
        p1.displayProductDetails();
        p2.displayProductDetails();
        p3.displayProductDetails();
        // Display total products (class method)
        Product.displayTotalProducts();
    }
}