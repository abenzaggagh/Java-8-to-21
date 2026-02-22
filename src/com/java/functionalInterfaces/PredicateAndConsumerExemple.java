package src.com.java.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class PredicateAndConsumerExemple {

    Predicate<Student> gradeLevelPredicate = (student) -> student.getGradeLevel() > 10;
    Predicate<Student> gpaPredicate = (student) -> student.getGpa() > 3.5;
    
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> {
        System.out.println("Name: " + name);
        System.out.println("Activities: " + activities);
    };

    Consumer<Student> studentConsumer = (student) -> {
        if (gradeLevelPredicate.and(gpaPredicate).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> students) {
        students.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> students = StudentDatabase.getAllStudents();

        new PredicateAndConsumerExemple().printNameAndActivities(students);
    }

}
