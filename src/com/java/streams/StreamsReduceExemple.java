package src.com.java.streams;

import java.util.List;
import java.util.Optional;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class StreamsReduceExemple {

    public static int performMultiplication(List<Integer> numbers) {
        // 1 
        // 3
        // 4
        // 5
        // 7

        // val1 = 1, val2 = 1 => result = 1
        // val1 = 1, val2 = 3 => result = 3
        // val1 = 3, val2 = 4 => result = 12
        // val1 = 12, val2 = 5 => result = 60
        // val1 = 60, val2 = 7 => result = 420
        return numbers.stream().reduce(1, (val1, val2) -> val1 * val2);
    }

    public static int performAddition(List<Integer> numbers) {
        return numbers.stream().reduce(0, (val1, val2) -> val1 + val2);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> numbers) {
        return numbers.stream().reduce((val1, val2) -> val1 * val2);
    }

    public static Optional<Student> getHighestGpaStudent() {
        return StudentDatabase.getAllStudents()
            .stream()
            .reduce((student1, student2) -> {
                if (student1.getGpa() > student2.getGpa()) {
                    return student1;
                } else {
                    return student2;
                }
            });
    }

    public static Optional<Student> getHighestGpaStudentInline() {
        return StudentDatabase.getAllStudents()
            .stream()
            .reduce((student1, student2) -> student1.getGpa() > student2.getGpa() ? student1 : student2);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 4, 5, 7);

        System.out.println(performMultiplication(numbers));
        System.out.println(performAddition(numbers));

        Optional<Integer> result = performMultiplicationWithoutIdentity(numbers);
        if (result.isPresent()) {
            System.out.println(result.get());
        }

        List<Integer> oneNumber = List.of();

        Optional<Integer> rOptional = performMultiplicationWithoutIdentity(oneNumber);
        if (rOptional.isPresent()) {
            System.out.println(rOptional.get());
        }

        Optional<Student> highestGpaStudent = getHighestGpaStudent();
        if (highestGpaStudent.isPresent()) {
            System.out.println(highestGpaStudent.get());
        }
    }
}
