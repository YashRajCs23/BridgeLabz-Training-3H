package com.gla.UniversityCourseEnrollmentSystem;

import java.util.*;

public class Professor extends Person {
    private List<Course> coursesTaught = new ArrayList<>();

    public Professor(int id, String name, String email) {
        super(id, name, email);
    }

    public void addCourse(Course c) {
        coursesTaught.add(c);
    }

    public List<Course> getCoursesTaught() { return coursesTaught; }
}
