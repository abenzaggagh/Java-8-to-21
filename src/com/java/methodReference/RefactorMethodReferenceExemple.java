package src.com.java.methodReference;

import java.util.function.Predicate;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class RefactorMethodReferenceExemple {
    
    static Predicate<Student> gradeLevelPredicate = RefactorMethodReferenceExemple::greaterThanGradeLevel;

    public static Boolean greaterThanGradeLevel(Student student) {
        return student.getGradeLevel() > 10;
    }

    public static void main(String[] args) {
        System.out.println(gradeLevelPredicate.test(StudentDatabase.studentSupplier.get()));
    }
}
