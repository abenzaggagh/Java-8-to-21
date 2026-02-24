package src.com.java.streams.terminalStreams;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsGroupingByExemple {
    
    // One Parameter
    public static Map<String, List<Student>> groupStudentByGender() {
        return StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.groupingBy(Student::getGender));
    }

    public static Map<String, List<Student>> customizedGroupStudent() {
        return StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.groupingBy((student -> student.getGpa() > 3.8 ? "Outstanding" : "Average")));
    }

    // Two Parameters
    public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping() {
        Map<Integer, Map<String, List<Student>>> result = StudentDatabase.getAllStudents()
            .stream()
            .collect(
                Collectors.groupingBy(Student::getGradeLevel, 
                    Collectors.groupingBy((student -> student.getGpa() > 3.8 ? "Outstanding" : "Average"))
                )
            );

        return result;
    }

    public static Map<String, Integer> twoLevelGroupingAndSummingInt() {
        Map<String, Integer> result = StudentDatabase.getAllStudents()
            .stream()
            .collect(
                Collectors.groupingBy(Student::getName, 
                    Collectors.summingInt(Student::getNoteBooks)
                )
            );

        return result;
    }

    public static void threeLevelArguemntGroupBy() {
        var result = StudentDatabase.getAllStudents()
            .stream()
            .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));

            System.out.println(result);
    }

    public static Map<Integer, Optional<Student>>  calculateTopGpa() {
        Map<Integer, Optional<Student>> result = StudentDatabase.getAllStudents()
            .stream()
            .collect(
                Collectors.groupingBy(Student::getGradeLevel, 
                    Collectors.maxBy(Comparator.comparing(Student::getGpa))
                )
            );

        return result;
    }

    public static void main(String[] args) {
        System.out.println(groupStudentByGender());

        System.out.println(customizedGroupStudent());

        System.out.println(twoLevelGrouping());

        System.out.println(twoLevelGroupingAndSummingInt());

        threeLevelArguemntGroupBy();

        System.out.println(calculateTopGpa());
    }
}
