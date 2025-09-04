package Constructor.Access Modifiers.Student;
public class Student {
    // Public: accessible everywhere
    public int rollNumber;
    // Protected: accessible within package and by subclasses
    protected String name;
    
    // Private: accessible only within this class
    private double cgpa;
    // Constructor
    public Student(int rollNumber, String name, double cgpa) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }
    // Public getter for CGPA (to access private variable)
    public double getCgpa() {
        return cgpa;
    }
    // Public setter for CGPA (to modify private variable)
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 10.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 10.0");
        }
    }
    // Display student details
    public void displayDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " + cgpa);
    }
}
    // Subclass demonstrating protected access
    class PostgraduateStudent extends Student {
    String specialization;
    public PostgraduateStudent(int rollNumber, String name, double cgpa, String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization = specialization;
    }
    // Method demonstrating access to protected variable (name)
    public void displayPostgraduateDetails() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name +
                           ", Specialization: " + specialization +
                           ", CGPA: " + getCgpa());
    }
}