package com.gla.UniversityCourseEnrollmentSystem;

public class Syllabus {
    private String topics;

    public Syllabus(String topics) {
        this.topics = topics;
    }

    public String getTopics() { return topics; }

    @Override
    public String toString() {
        return "Syllabus: " + topics;
    }
}
