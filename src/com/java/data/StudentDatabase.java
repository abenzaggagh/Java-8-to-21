package src.com.java.data;

import java.util.Arrays;
import java.util.List;

public class StudentDatabase {
    /**
     * This method returns a list of students with their name, grade level, GPA, gender, and activities.
     * @return List of students
     */
    public static List<Student> getAllStudents() {
        
        Student student1 = new Student("Alice", 10, 3.5, "Female", Arrays.asList("Basketball", "Chess"));
        Student student2 = new Student("Bob", 11, 3.8, "Male", Arrays.asList("Football", "Debate"));
        Student student3 = new Student("Charlie", 12, 3.2, "Male", Arrays.asList("Baseball", "Music"));
        Student student4 = new Student("Diana", 10, 3.9, "Female", Arrays.asList("Tennis", "Art"));
        Student student5 = new Student("Eve", 11, 3.6, "Female", Arrays.asList("Swimming", "Drama"));
        Student student6 = new Student("Frank", 12, 3.4, "Male", Arrays.asList("Soccer", "Science Club"));
        Student student7 = new Student("Grace", 10, 3.7, "Female", Arrays.asList("Volleyball", "Math Club"));

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6, student7);

        return students;
    }
}
