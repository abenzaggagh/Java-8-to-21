package src.com.java.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsExemple {

    public static void main(String[] args) {
        Predicate<Student> gradeLevelPredicate = (student) -> student.getGradeLevel() > 10;
        Predicate<Student> gpaPredicate = (student) -> student.getGpa() > 3.5;

        Map<String, List<String>> studentMap = StudentDatabase.getAllStudents()
        .stream()
        .peek(student -> System.out.println("Before filter: " + student))
        .filter(gradeLevelPredicate)
        .peek(student -> System.out.println("After grade level filter: " + student))
        .filter(gpaPredicate)
        .peek(student -> System.out.println("After GPA filter: " + student))
        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println(studentMap);
    }
}
