package src.com.java.streams;

import java.util.Optional;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsFindExemple {
    
    public static Optional<Student> findAny() {
        return StudentDatabase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9).findAny();
    }

    public static Optional<Student> findFirst() {
        return StudentDatabase.getAllStudents().stream().filter(student -> student.getGpa() >= 4.1).findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> findAnyStudent = findAny();

        if (findAnyStudent.isPresent()) {
            System.out.println(findAnyStudent.get());
        } else { 
            System.out.println("Student not found by findAny");
        }

        Optional<Student> findFirstStudent = findFirst();

        if (findFirstStudent.isPresent()) {
            System.out.println(findFirstStudent.get());
        } else { 
            System.out.println("Student not found by findFirst");
        }
    }
}
