package src.com.java.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfGenerateIterateExemple {
    

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("apple", "banana", "cherry");
        stream.forEach(System.out::println);

        Stream.iterate(1, x -> x * 2).limit(1000).forEach(System.out::println);

        Supplier<Integer> random = new Random()::nextInt;

        Stream.generate(random).limit(10).forEach(System.out::println);
    }

}
