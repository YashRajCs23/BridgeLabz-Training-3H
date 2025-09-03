package Constructor.Level 1.Circle;
public class CircleMain {
    public static void main(String[] args) {
        
        Circle c1 = new Circle();  // default constructor (radius = 1)
        Circle c2 = new Circle(5); // parameterized
        System.out.println("Default Circle Area: " + c1.area());
        System.out.println("Circle with radius 5 Area: " + c2.area());
    }
}