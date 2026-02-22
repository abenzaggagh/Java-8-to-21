package src.com.java.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class ConsumerExemple {

    static Consumer<Student> consumer = (student) -> System.out.println(student);
    static Consumer<Student> consumerName = (student) -> System.out.println(student.getName());
    static Consumer<Student> consumerActivities = (student) -> System.out.println(student.getActivities());

    static void printStudents() {
        List<Student> students = StudentDatabase.getAllStudents();
        
        students.forEach(consumer);
    }

    static void printNameAndActivities() {
        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach(consumerName.andThen(consumerActivities));
    }

    static void printNameAndActivitiesUsingCondition() {        
        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach((student) -> {
            if (student.getGradeLevel() > 10 && student.getGpa() >= 3.2) {
                consumerName.andThen(consumerActivities).andThen(consumer).accept(student);
            }
        });
    }
    
    public static void main(String[] args) {
        Consumer<String> consumer = (str) -> System.out.println(str.toUpperCase());
        
        consumer.accept("Java 8");

        printStudents();

        printNameAndActivities();
        
        System.out.println("printNameAndActivitiesUsingCondition:");
        
        printNameAndActivitiesUsingCondition();
    }
}
