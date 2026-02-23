package src.com.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsFilterExemple {
    
    public static List<Student> filterStudents() {
        return StudentDatabase.getAllStudents()
            .stream()
            .filter(student -> "Female".equals(student.getGender()))
            .filter(student -> student.getGradeLevel() > 10)
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("filterStudents: " + filterStudents());
    }
}
