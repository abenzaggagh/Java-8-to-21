package src.com.java.streams.parallelStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParalledStreamBoxedExemple {
    
    public static int sequentialSum(List<Integer> list) {
        Long startTime = System.currentTimeMillis();

        int result = list.stream().reduce(0, Integer::sum);
        
        Long endTime = System.currentTimeMillis();
        
        System.out.println("Sequential execution time: " + (endTime - startTime));
        
        return result;
    }

    public static int parallelSum(List<Integer> list) {
        Long startTime = System.currentTimeMillis();
        
        int result = list.parallelStream().reduce(0, Integer::sum);
        
        Long endTime = System.currentTimeMillis();
        
        System.out.println("Parallel execution time: " + (endTime - startTime));
        
        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = IntStream.range(1, 100000)
            .boxed()
            .collect(Collectors.toList());

        sequentialSum(list);
        parallelSum(list);
    }
}
