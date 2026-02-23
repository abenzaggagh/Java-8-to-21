package src.com.java.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {

    public static Supplier<Student> studentSupplier = () -> {
        return getAllStudents().getFirst();
    };

    /**
     * This method returns a list of students with their name, grade level, GPA, gender, and activities.
     * @return List of students
     */
    public static List<Student> getAllStudents() {
        
        Student student1 = new Student("Alice", 10, 3.5, "Female", Arrays.asList("Basketball", "Chess"), 5);
        Student student2 = new Student("Bob", 11, 3.8, "Male", Arrays.asList("Football", "Debate"), 4);
        Student student3 = new Student("Charlie", 12, 3.2, "Male", Arrays.asList("Baseball", "Music"), 0);
        Student student4 = new Student("Diana", 10, 3.9, "Female", Arrays.asList("Tennis", "Art"), 7);
        Student student5 = new Student("Eve", 11, 3.6, "Female", Arrays.asList("Swimming", "Drama"), 3);
        Student student6 = new Student("Frank", 12, 3.4, "Male", Arrays.asList("Soccer", "Science Club"), 2);
        Student student7 = new Student("Grace", 10, 3.7, "Female", Arrays.asList("Volleyball", "Tennis"), 1);

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7);

        return students;
    }
}
