package Constructor.Access Modifiers.Student;
public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 8.5);
        s1.displayDetails();
        // Accessing rollNumber (public)
        
        System.out.println("Roll Number (direct access): " + s1.rollNumber);
        // Accessing private cgpa through getter and setter
        System.out.println("CGPA (via getter): " + s1.getCgpa());
        s1.setCgpa(9.2);
        System.out.println("Updated CGPA (via getter): " + s1.getCgpa());
        // Creating a PostgraduateStudent
        PostgraduateStudent pg1 = new PostgraduateStudent(201, "Bob", 8.8, "Computer Science");
        pg1.displayPostgraduateDetails();
    }
}