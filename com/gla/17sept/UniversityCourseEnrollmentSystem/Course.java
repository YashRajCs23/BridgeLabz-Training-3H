package com.gla.UniversityCourseEnrollmentSystem;

import java.util.*;

public abstract class Course implements Evaluatable {
    private final String courseCode;
    private String courseName;
    private Professor professor;
    private Syllabus syllabus;
    private List<Student> students = new ArrayList<>();

    public Course(String code, String name, Professor prof, Syllabus syllabus) {
        this.courseCode = code;
        this.courseName = name;
        this.professor = prof;
        this.syllabus = syllabus;
        if(prof != null) prof.addCourse(this);
    }

    public String getCourseCode() { return courseCode; }
    public String getCourseName() { return courseName; }
    public Syllabus getSyllabus() { return syllabus; }

    public void addStudent(Student s) {
        students.add(s);
    }

    public List<Student> getStudents() { return students; }

    @Override
    public String toString() {
        return courseCode + " - " + courseName;
    }
}
