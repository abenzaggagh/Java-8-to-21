package src.com.java.methodReference;

import java.util.function.Consumer;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class ConsumerMethodReferenceExemple {

    static Consumer<Student> consumer = System.out::println;

    static Consumer<Student> studentActivities = Student::printActivities;
    
    public static void main(String[] args) {
        StudentDatabase.getAllStudents().forEach(consumer);
        StudentDatabase.getAllStudents().forEach(studentActivities);
    }

}
