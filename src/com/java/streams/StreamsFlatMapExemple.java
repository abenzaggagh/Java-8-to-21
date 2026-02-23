package src.com.java.streams;

import java.util.List;
import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsFlatMapExemple {
    
    public static List<String> printStudentActivities() {
        return StudentDatabase.getAllStudents()
            .stream() // Stream<Student>
            .map(Student::getActivities) // Stream<List<String>>
            .flatMap(List::stream) // Stream<String>
            .distinct()
            .sorted()
            .collect(Collectors.toList());
    }

    public static long getStudentActivitiesCount() {
        return StudentDatabase.getAllStudents()
            .stream() // Stream<Student>
            .map(Student::getActivities) // Stream<List<String>>
            .flatMap(List::stream) // Stream<String>
            .distinct()
            .count();
    }

    public static void main(String[] args) {
        System.out.println("printStudentActivities: " + printStudentActivities());

        System.out.println("getStudentActivitiesCount: " + getStudentActivitiesCount());
    }
}
