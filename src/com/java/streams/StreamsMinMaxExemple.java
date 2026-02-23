package src.com.java.streams;

import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExemple {
    
    public static int findMaxValue(List<Integer> numbers) {
        return numbers.stream().reduce(0, (num1, num2) -> num1 > num2 ? num1 : num2);
    }

    public static Optional<Integer> findMaxOptional(List<Integer> numbers) {
        return numbers.stream().reduce((num1, num2) -> num1 > num2 ? num1 : num2);
    }

    public static int findMinValue(List<Integer> numbers) {
        // Bad Practice : Don't use initial value as 0
        return numbers.stream().reduce(0, (num1, num2) -> num1 > num2 ? num2 : num1);
    }

    public static Optional<Integer> findMinOptional(List<Integer> numbers) {
        return numbers.stream().reduce((num1, num2) -> num1 > num2 ? num2 : num1);
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 21, 300, 43, 60, 7, 8, 98, 10);
        List<Integer> empty = List.of();

        System.out.println("Max value: " + findMaxValue(numbers));
        System.out.println("Max value: " + findMaxValue(empty));

        Optional<Integer> maxNumbersOptional = findMaxOptional(numbers);
        System.out.println("Contains max: " + maxNumbersOptional.isPresent());
        if (maxNumbersOptional.isPresent()) {
            System.out.println("Max value: " + maxNumbersOptional.get());
        }
        Optional<Integer> maxEmptyOptional = findMaxOptional(empty);
        System.out.println("Contains max: " + maxEmptyOptional.isPresent());
        if (maxEmptyOptional.isPresent()) {
            System.out.println("Max value: " + maxEmptyOptional.get());
        }

        System.out.println("Min value " + findMinValue(numbers));
        System.out.println("Min value " + findMinValue(empty));

        Optional<Integer> minNumbersOptional = findMinOptional(numbers);
        System.out.println("Contains min: " + minNumbersOptional.isPresent());
        if (minNumbersOptional.isPresent()) {
            System.out.println("Min value: " + minNumbersOptional.get());
        }
        Optional<Integer> minEmptyOptional = findMinOptional(empty);
        System.out.println("Contains min: " + minEmptyOptional.isPresent());
        if (minEmptyOptional.isPresent()) {
            System.out.println("Min value: " + minEmptyOptional.get());
        }
    }
}
