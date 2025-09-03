package Constructor.Level 1.Circle;
public class Circle {
    
    double radius;
    public Circle() {
        this(1.0);
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}