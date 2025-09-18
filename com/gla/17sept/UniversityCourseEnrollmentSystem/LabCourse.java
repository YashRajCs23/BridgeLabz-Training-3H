package com.gla.UniversityCourseEnrollmentSystem;

public class LabCourse extends Course {
    public LabCourse(String code, String name, Professor prof, Syllabus syllabus) {
        super(code, name, prof, syllabus);
    }

    @Override
    public void conductExam() {
        System.out.println("Conducting practical lab assessment for " + getCourseName());
    }

    @Override
    public void evaluateStudent(Student s) {
        s.setResult(this, "B+");
    }
}
