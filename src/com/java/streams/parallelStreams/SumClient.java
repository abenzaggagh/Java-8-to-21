package src.com.java.streams.parallelStreams;

import java.util.stream.IntStream;

public class SumClient {
    
    public static void main(String[] args) {
        Sum sum = new Sum(0);

        IntStream.rangeClosed(1, 1000000).parallel().forEach(sum::add);

        System.out.println("sum: " + sum.getTotal());
    }
}
