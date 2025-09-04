package Constructor.Instance vs. Class Variables and Methods.Course;
public class CourseMain {
    
    public static void main(String[] args) {
        Course c1 = new Course("Java Programming", 6, 15000);
        Course c2 = new Course("Web Development", 4, 12000);
        Course c3 = new Course("Data Science", 8, 25000);
        // Display initial course details
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
        // Update institute name using class method
        Course.updateInstituteName("SkillUp Academy");
        // Display updated details (all courses reflect change)
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
    }
}