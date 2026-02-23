package src.com.java.streams.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExemple {
    
    public static void main(String[] args) {
        IntStream intStream = IntStream.rangeClosed(1, 10);
        System.out.println("Sum: " + intStream.sum());

        System.out.println("Max: " + IntStream.rangeClosed(1, 10).max());

        System.out.println(IntStream.rangeClosed(0, 0).count());

        OptionalInt min = IntStream.rangeClosed(0, 0).min();

        if (min.isPresent()) {
            System.out.println("Min: " + min.getAsInt());
        } else {
            System.out.println("Min value not found");
        }

        OptionalLong optionalLong = LongStream.rangeClosed(0, 0).min();

        System.out.println("Min: " + (optionalLong.isPresent() ? optionalLong.getAsLong() : "Min value not found"));

        OptionalDouble average = IntStream.rangeClosed(1, 50).average();
        
        System.out.println("Average: " + average.orElse(0.0));
    }
}
