package src.com.java.streams.parallelStreams;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExemple {

    public static long checkPerformance(Supplier<Integer> supplier, int numberofTimes) {
        long startTime = System.currentTimeMillis();
        
        for(int i = 0; i < numberofTimes; i++) {
            supplier.get();
        }
        
        long endTime = System.currentTimeMillis();
        
        return endTime - startTime;
    }
    
    public static int sumSequenceStream() {
        return IntStream.range(1, 100000000 ).sum();
    }

    public static int sumParallelStream() {
        return IntStream.range(1, 100000000 ).parallel().sum();
    }

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        
        System.out.println(checkPerformance(ParallelStreamExemple::sumSequenceStream, 20));
        System.out.println(checkPerformance(ParallelStreamExemple::sumParallelStream, 20));
    }
}
