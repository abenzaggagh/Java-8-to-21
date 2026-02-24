package src.com.java.streams.terminalStreams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsMappingExemple {
    


    public static void main(String[] args) {
        List<String> names = StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.mapping(Student::getName, Collectors.toList()));
            
        System.out.println("names: " + names);

        Set<String> namesSet = StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.mapping(Student::getName, Collectors.toSet()));

        System.out.println("namesSet: " + names);
    }
}
