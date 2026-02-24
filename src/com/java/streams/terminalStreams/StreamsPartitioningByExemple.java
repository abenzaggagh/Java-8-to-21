package src.com.java.streams.terminalStreams;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsPartitioningByExemple {
    
    public static void partitioningBy() {
        Predicate<Student> predicateGpa = student -> student.getGpa() >= 3.8;
        
        Map<Boolean, List<Student>> result = StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.partitioningBy(predicateGpa));

        System.out.println(result);
    }

    public static void partitioningByTwoArgs() {
        Predicate<Student> predicateGpa = student -> student.getGpa() >= 3.8;
        
        Map<Boolean, Set<Student>> result = StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.partitioningBy(predicateGpa, Collectors.toSet()));

        System.out.println(result);
    }

    public static void main(String[] args) {
        partitioningBy();

        partitioningByTwoArgs();
    }
}
