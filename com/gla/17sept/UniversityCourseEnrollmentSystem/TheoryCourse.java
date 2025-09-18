package com.gla.UniversityCourseEnrollmentSystem;

public class TheoryCourse extends Course {
    public TheoryCourse(String code, String name, Professor prof, Syllabus syllabus) {
        super(code, name, prof, syllabus);
    }

    @Override
    public void conductExam() {
        System.out.println("Conducting written theory exam for " + getCourseName());
    }

    @Override
    public void evaluateStudent(Student s) {
        s.setResult(this, "A");
    }
}
