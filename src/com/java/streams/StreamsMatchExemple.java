package src.com.java.streams;

import src.com.java.data.StudentDatabase;

public class StreamsMatchExemple {
    public static Boolean allMatch() {
        return StudentDatabase.getAllStudents().stream().allMatch(student -> student.getGpa() >= 3.2);
    }

    public static Boolean anyMatch() {
        return StudentDatabase.getAllStudents().stream().anyMatch(student -> student.getGpa() >= 4.0);
    }

    public static Boolean noneMatch() {
        return StudentDatabase.getAllStudents().stream().noneMatch(student -> student.getGpa() >= 4.0);
    }

    public static void main(String[] args) {
        System.out.println("allMatch: " + allMatch());

        System.out.println("anyMatch: " + anyMatch());

        System.out.println("noneMatch: " + noneMatch());
    }
}
