package src.com.java.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsComparatorExemple {
    
    public static List<Student> sortedStudentsByName() {
        return StudentDatabase.getAllStudents()
            .stream()
            .sorted(Comparator.comparing(Student::getName))
            .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsByGpa() {
        return StudentDatabase.getAllStudents()
            .stream()
            .sorted(Comparator.comparing(Student::getGpa))
            .collect(Collectors.toList());
    }

    public static List<Student> sortedStudentsByGpaDesc() {
        return StudentDatabase.getAllStudents()
            .stream()
            .sorted(Comparator.comparing(Student::getGpa).reversed())
            .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("sortedStudentsByName: \n" + sortedStudentsByName());
        System.out.println("sortedStudentsByGpa: \n" + sortedStudentsByGpa());
        System.out.println("sortedStudentsByGpaDesc: \n" + sortedStudentsByGpaDesc());
    }

}
