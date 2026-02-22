package src.com.java.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class BiConsumerExemple {

    static void nameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println("Name: " + name);
            System.out.println("Activities: " + activities);
        };
        
        List<Student> students = StudentDatabase.getAllStudents();

        students.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }
    
    public static void main(String[] args) {
        
        BiConsumer<String, String> biConsumer = (a, b) -> 
            System.out.println("a: " + a + " b: " + b);
        
        biConsumer.accept("Java 7", "Java 8");

        BiConsumer<Integer, Integer> mutiply = (a, b) ->
            System.out.println("Multiplication: " + (a * b));

        BiConsumer<Integer, Integer> divide = (a, b) ->
            System.out.println("Division: " + (a / b));

        mutiply.andThen(divide).accept(12, 11);

        nameAndActivities();
    }

}
