package com.gla.UniversityCourseEnrollmentSystem;

public class UniversitySystem {

    public static void generateTranscript(Student s) {
        System.out.println("\n--- Transcript for " + s.getName() + " ---");
        for (Course c : s.getEnrolledCourses()) {
            String grade = s.getResults().getOrDefault(c, "Not Graded");
            System.out.println(c + " : " + grade);
        }
    }

    public static void main(String[] args) {
        Professor p1 = new Professor(1, "Dr. Smith", "smith@uni.edu");
        Syllabus s1 = new Syllabus("OOP, Inheritance, Interfaces");
        Syllabus s2 = new Syllabus("Circuits, Lab Experiments");

        Course c1 = new TheoryCourse("CS101", "Object Oriented Programming", p1, s1);
        Course c2 = new LabCourse("EE201", "Electronics Lab", p1, s2);

        Student st1 = new Student(101, "Alice", "alice@uni.edu");
        st1.enroll(c1);
        st1.enroll(c2);

        // Conduct and evaluate
        c1.conductExam();
        c1.evaluateStudent(st1);

        c2.conductExam();
        c2.evaluateStudent(st1);

        // Generate Transcript
        generateTranscript(st1);
    }
}