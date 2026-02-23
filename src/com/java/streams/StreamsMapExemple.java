package src.com.java.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsMapExemple {

    public static List<String> namesList() {
        return StudentDatabase.getAllStudents()
        .stream()
        .map(Student::getName)
        .map(String::toUpperCase)
        .collect(Collectors.toList());
    }

    public static Set<String> namesSet() {
        return StudentDatabase.getAllStudents()
        .stream()
        .map(Student::getName)
        .map(String::toUpperCase)
        .collect(Collectors.toSet());
    }
    
    public static void main(String[] args) {
        System.out.println(namesList());

        System.out.println(namesSet());
    }
}
