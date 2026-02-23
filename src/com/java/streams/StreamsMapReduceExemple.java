package src.com.java.streams;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsMapReduceExemple {

    private static int noOfNoteBooks() {
        return StudentDatabase.getAllStudents()
            .stream()
            .filter(student -> student.getGradeLevel() > 10)
            .filter(student -> "Female".equals(student.getGender()))
            .map(Student::getNoteBooks)
            .reduce(0, (noteBooks, accumulate) -> noteBooks + accumulate);
    }

    private static int sumNoOfNoteBooks() {
        return StudentDatabase.getAllStudents()
            .stream()
            .map(Student::getNoteBooks)
            .reduce(0, Integer::sum);
    }
    
    public static void main(String[] args) {
        System.out.println("No of Note Books: " + noOfNoteBooks());
        System.out.println("No of Note Books: " + sumNoOfNoteBooks());
    }
}
