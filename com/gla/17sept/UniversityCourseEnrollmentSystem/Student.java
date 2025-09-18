package com.gla.UniversityCourseEnrollmentSystem;

import java.util.*;

public class Student extends Person {
    private List<Course> enrolledCourses = new ArrayList<>();
    private Map<Course, String> results = new HashMap<>();

    public Student(int id, String name, String email) {
        super(id, name, email);
    }

    public void enroll(Course c) {
        if (enrolledCourses.size() >= UniversityRules.MAX_COURSES_PER_STUDENT) {
            System.out.println("Cannot enroll in more than " + UniversityRules.MAX_COURSES_PER_STUDENT + " courses.");
            return;
        }
        enrolledCourses.add(c);
        c.addStudent(this);
    }

    public void setResult(Course c, String grade) {
        results.put(c, grade);
    }

    public List<Course> getEnrolledCourses() { return enrolledCourses; }
    public Map<Course,String> getResults() { return results; }
}
