package src.com.java.streams.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamUnboxingBoxingExemple {

    public static List<Integer> boxing() {
        IntStream intStream = IntStream.rangeClosed(1, 10);

        return intStream.boxed().collect(Collectors.toList());
    }

    public static int unboxing() {
        List<Integer> boxedList = List.of(1, 2, 3, 4, 5);

        return boxedList.stream().mapToInt(Integer::intValue).sum();
    }
    
    public static void main(String[] args) {
        System.out.println(boxing());
        System.out.println(unboxing());
    }
}
