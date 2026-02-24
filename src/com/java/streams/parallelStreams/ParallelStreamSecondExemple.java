package src.com.java.streams.parallelStreams;

import java.util.List;
import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class ParallelStreamSecondExemple {

    public static List<String> sequentialPrintStudentActivities() {
        Long startTime = System.currentTimeMillis();

        List<String> result = StudentDatabase.getAllStudents()
            .stream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList());
        
        Long endTime = System.currentTimeMillis();

        System.out.println("Sequential execution time: " + (endTime - startTime));
        
        return result;
    }

    public static List<String> parallelPrintStudentActivities() {
        Long startTime = System.currentTimeMillis();

        List<String> result = StudentDatabase.getAllStudents()
            .parallelStream()
            .map(Student::getActivities)
            .flatMap(List::stream)
            .distinct()
            .sorted()
            .collect(Collectors.toList());
        
        Long endTime = System.currentTimeMillis();

        System.out.println("Parallel execution time: " + (endTime - startTime));
        
        return result;
    }
    
    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
