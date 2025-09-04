package Constructor.Instance vs. Class Variables and Methods.Course;
public class Course {
    
    // Instance variables
    String courseName;
    int duration;   // in months
    double fee;
    // Class variable (shared among all courses)
    static String instituteName = "Tech Academy";
    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
    // Instance method
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName +
                           ", Course: " + courseName +
                           ", Duration: " + duration + " months" +
                           ", Fee: " + fee);
    }
    // Class method
    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute name updated to: " + instituteName);
    }
}