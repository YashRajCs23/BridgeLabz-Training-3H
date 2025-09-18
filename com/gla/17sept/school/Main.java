package com.gla.school;

public class Main {
    public static void main(String[] args) {

        // Create Teachers
        Teacher t1 = new Teacher("Dr. Sharma");
        Teacher t2 = new Teacher("Prof. Mehta");

        // Create Courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Operating Systems");
        Course c3 = new Course("Database Systems");

        // Build associations (bidirectional automatically)
        t1.addCourse(c1);
        t1.addCourse(c2);

        t2.addCourse(c2);
        t2.addCourse(c3);

        // --- Print all teachers with their courses ---
        System.out.println("Teachers and their Courses:");
        for (Teacher t : new Teacher[]{t1, t2}) {
            System.out.print(t.getName() + " teaches: ");
            t.getCourses().forEach(c -> System.out.print(c.getTitle() + "  "));
            System.out.println();
        }

        // --- Optional: Print all courses with their teachers ---
        System.out.println("\nCourses and their Teachers:");
        for (Course c : new Course[]{c1, c2, c3}) {
            System.out.print(c.getTitle() + " taught by: ");
            c.getTeachers().forEach(tt -> System.out.print(tt.getName() + "  "));
            System.out.println();
        }
    }
}
