package src.com.java.streams.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExemple {
    
    public static int sumOfNumbers(List<Integer> numbers) {
        return numbers.stream().reduce(0, (x, y) -> x + y);
    }

    public static int sumOfNumbersWithIntStream() {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        return intStream.sum();
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println("Sum of numbers: " + sumOfNumbers(numbers));
        System.out.println("Sum of numbers with IntStream: " + sumOfNumbersWithIntStream());
    }
}
