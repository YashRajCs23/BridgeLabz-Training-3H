import java.util.Scanner;
public class practiceProblems {
    // 1. Welcome message
    public static void welcomeMessage() {
        System.out.println("Welcome to Bridgelabz!");
    }

    // 2. Add two numbers
    public static void addTwoNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.println("Sum = " + (num1 + num2));
    }

    // 3. Celsius to Fahrenheit
    public static void celsiusToFahrenheit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit = " + fahrenheit);
    }

    // 4. Area of a Circle
    public static void areaOfCircle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle = " + area);
    }

    // 5. Volume of a Cylinder
    public static void volumeOfCylinder() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of cylinder = " + volume);
    }

    // 6. Simple Interest
    public static void simpleInterest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate (%): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (years): ");
        double time = sc.nextDouble();
        double si = (principal * rate * time) / 100;
        System.out.println("Simple Interest = " + si);
    }

    // 7. Perimeter of a Rectangle
    public static void perimeterOfRectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        double length = sc.nextDouble();
        System.out.print("Enter width: ");
        double width = sc.nextDouble();
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }

    // 8. Power calculation
    public static void powerCalculation() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();
        double result = Math.pow(base, exponent);
        System.out.println(base + " raised to " + exponent + " = " + result);
    }

    // 9. Average of three numbers
    public static void averageOfThreeNumbers() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();
        double average = (num1 + num2 + num3) / 3;
        System.out.println("Average = " + average);
    }

    // 10. Kilometers to Miles
    public static void kilometersToMiles() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * 0.621371;
        System.out.println(km + " kilometers = " + miles + " miles");
    }

    // Main method to test
    public static void main(String[] args) {
        welcomeMessage();
        addTwoNumbers();
        celsiusToFahrenheit();
        areaOfCircle();
        volumeOfCylinder();
        simpleInterest();
        perimeterOfRectangle();
        powerCalculation();
        averageOfThreeNumbers();
        kilometersToMiles();
    }
}