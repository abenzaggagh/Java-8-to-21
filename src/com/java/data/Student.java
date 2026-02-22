package src.com.java.data;

import java.util.List;

public class Student {
    private final String name;
    private final int gradeLevel;
    private final double gpa;
    private final String gender;

    List<String> activities;

    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }

    public String getName() {
        return name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public String getGender() {
        return gender;
    }

    public List<String> getActivities() {
        return activities;
    }

    public String toString() {
        return "Student: \n\tName: " + name + "\n\tGrade Level: " + gradeLevel + "\n\tGPA: " + gpa + "\n\tGender: " + gender + "\n\tActivities: " + activities; 
    }

}
