package src.com.java.streams.terminalStreams;

import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;


public class StreamsJoiningExemple {
    
    public static String joining() {
        return StudentDatabase.getAllStudents()
            .stream()
            .map(Student::getName)
            .collect(Collectors.joining());
    }

    public static String joiningWithDelimiter() {
        return StudentDatabase.getAllStudents()
            .stream()
            .map(Student::getName)
            .collect(Collectors.joining(", "));
    }

    public static String joiningWithDelimiterAndPrefixAndSuffix() {
        return StudentDatabase.getAllStudents()
            .stream()
            .map(Student::getName)
            .collect(Collectors.joining(", ", "[", "]"));
    }

    public static void main(String[] args) {
        System.out.println("joining: " + joining());
        System.out.println("joining with delimiter: " + joiningWithDelimiter());
        System.out.println("joining with delimiter and prefix/suffix: " + joiningWithDelimiterAndPrefixAndSuffix());
    }
}
