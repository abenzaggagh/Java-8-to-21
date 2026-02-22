package src.com.java.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class BiFunctionExemple {
    
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, predicate) -> {
        Map<String, Double> studentsGradeMap = new HashMap<String, Double>();

        students.forEach(student -> {
            if (predicate.test(student)) {
                studentsGradeMap.put(student.getName(), student.getGpa());
            }
        });

        return studentsGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDatabase.getAllStudents(), PredicateStudentExemple.gpaPredicate));
    }

}
