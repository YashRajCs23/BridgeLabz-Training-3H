package com.gla.school;

import java.util.HashSet;
import java.util.Set;

public class Teacher {
    private String name;
    private Set<Course> courses = new HashSet<>();

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    // Add course and maintain reverse relationship
    public void addCourse(Course course) {
        if (courses.add(course)) {        // add returns true if it was not already present
            course.addTeacher(this);      // maintain reverse link
        }
    }

    @Override
    public String toString() {
        return name;
    }
}
