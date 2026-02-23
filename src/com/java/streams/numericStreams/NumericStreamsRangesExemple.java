package src.com.java.streams.numericStreams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class NumericStreamsRangesExemple {
    
    public static void main(String[] args) {
        System.out.println("Open Range");
        IntStream intStream = IntStream.range(1, 50);
        System.out.println(intStream.count());

        IntStream.range(1, 50).forEach(System.out::println);

        System.out.println("Closed Range");
        IntStream intStreamClosed = IntStream.rangeClosed(1, 50);
        System.out.println(intStreamClosed.count());

        IntStream.rangeClosed(1, 50).forEach(System.out::println);

        System.out.println("Double Stream");
        IntStream.rangeClosed(1, 50).asDoubleStream().forEach(System.out::println);
    }
}
