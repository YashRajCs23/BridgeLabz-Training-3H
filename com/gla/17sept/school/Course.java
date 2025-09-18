package com.gla.school;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private String title;
    private Set<Teacher> teachers = new HashSet<>();

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public Set<Teacher> getTeachers() {
        return teachers;
    }

    // Add teacher and maintain reverse relationship
    public void addTeacher(Teacher teacher) {
        if (teachers.add(teacher)) {       // only if not already present
            teacher.addCourse(this);       // maintain reverse link
        }
    }

    @Override
    public String toString() {
        return title;
    }
}
