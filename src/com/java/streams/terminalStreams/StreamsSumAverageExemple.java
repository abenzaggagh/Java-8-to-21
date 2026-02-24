package src.com.java.streams.terminalStreams;

import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsSumAverageExemple {
    
    public static int sumOfNoteBooks() {
        return StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.summingInt(Student::getNoteBooks));
    }

    public static double averageOfGradeLevel() {
        return StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.averagingInt(Student::getGradeLevel));
    }

    public static void main(String[] args) {
        System.out.println("sumOfNoteBooks " + sumOfNoteBooks());
        System.out.println("averageOfGradeLevel " + averageOfGradeLevel());
    }
}
