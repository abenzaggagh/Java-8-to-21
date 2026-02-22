package src.com.java.functionalInterfaces;

import java.util.List;
import java.util.function.Predicate;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class PredicateStudentExemple {
    
    static Predicate<Student> gradeLevelPredicate = (student) -> student.getGradeLevel() > 10;

    static Predicate<Student> gpaPredicate = (student) -> student.getGpa() > 3.5;

    static void filterStudentsByGradeLevel() {
        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach(student -> {
            if (gradeLevelPredicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    static void filterStudentsByGpa() {
        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach(student -> {
            if (gpaPredicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    static void filterStudentsByGradeLevelAndGpa() {
        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach(student -> {
            if (gradeLevelPredicate.and(gpaPredicate).test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("filterStudentsByGradeLevel: ");
        filterStudentsByGradeLevel();
        System.out.println("filterStudentsByGpa: ");
        filterStudentsByGpa();
        System.out.println("filterStudentsByGradeLevelAndGpa: ");
        filterStudentsByGradeLevelAndGpa();
    }
}
