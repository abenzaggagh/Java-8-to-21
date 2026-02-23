package src.com.java.streams;

import java.util.List;
import java.util.Optional;

public class StreamsLimitSkipExemple {

    public static Optional<Integer> limit(List<Integer> numbers) {
        return numbers.stream()
            .limit(2)
            .reduce(Integer::sum);
    }

    public static Optional<Integer> skip(List<Integer> numbers) {
        return numbers.stream()
            .skip(3)
            .reduce(Integer::sum);
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = List.of(100, 21, 300, 43, 60, 7, 8, 98, 10);
        
        System.out.println(limit(numbers));
        System.out.println(skip(numbers));
    }
}
