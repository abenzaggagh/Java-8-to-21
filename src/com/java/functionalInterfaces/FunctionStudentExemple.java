package src.com.java.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class FunctionStudentExemple {
    
    static Function<List<Student>, Map<String, Double>> funtion = (students) -> {
        Map<String, Double> studentGradeMap = new HashMap<String, Double>();

        students.forEach(student -> {
            if (PredicateStudentExemple.gpaPredicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());           
            }
        });

        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(funtion.apply(StudentDatabase.getAllStudents()));
    }
}
