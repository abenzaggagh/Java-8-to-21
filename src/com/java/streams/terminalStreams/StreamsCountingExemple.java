package src.com.java.streams.terminalStreams;

import java.util.stream.Collectors;

import src.com.java.data.StudentDatabase;

public class StreamsCountingExemple {
    
    public static long count() {
        return StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.counting());
    }

    public static long countWithFilter() {
        return StudentDatabase.getAllStudents()
            .stream()
            .filter(student -> student.getGpa() >= 3.9)
            .collect(Collectors.counting());
    }

    public static void main(String[] args) {
        System.out.println("Count: " + count());
        System.out.println("Count with filter: " + countWithFilter());
    }
}
