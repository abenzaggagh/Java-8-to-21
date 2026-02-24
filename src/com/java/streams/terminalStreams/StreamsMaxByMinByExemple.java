package src.com.java.streams.terminalStreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsMaxByMinByExemple {
    
    public static Optional<Student> minByExemple() {
        return StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxByExemple() {
        return StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println("minBy: " + minByExemple());

        System.out.println("maxBy: " + maxByExemple());
    }
}
