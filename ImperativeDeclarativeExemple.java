import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ImperativeDeclarativeExemple {
     
    public static void main(String... args) {
        // Imperatvie 

        int sum = 0;

        for(int i = 0; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Sum using Imperative Approach: " + sum);

        // Declarative

        int declarativeSum = IntStream.rangeClosed(0, 100000000)
            .parallel()
            .sum();

        System.out.println("Sum using Declarative Approach: " + declarativeSum);


        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9, 10);

        List<Integer> distincIntegers = new ArrayList<>();

        for(Integer integer : integers) {
            if (!distincIntegers.contains(integer)) {
                distincIntegers.add(integer);
            }
        }

        System.out.println("Distinct Integers using Imperative Approach: " + distincIntegers);

        List<Integer> distinctIntegersDeclarative = integers.stream()
            .distinct()
            .toList();

        System.out.println("Distinct Integers using Declarative Approach: " + distinctIntegersDeclarative);
    }
    
}