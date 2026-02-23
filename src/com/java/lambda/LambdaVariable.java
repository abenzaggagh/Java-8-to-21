package src.com.java.lambda;

import java.util.function.Consumer;

public class LambdaVariable {
    
    public static void main(String[] args) {
        int i = 0; // Local variable must be effectively final to be used in lambda expression

        Consumer<Integer> consumer = (i1) -> {
            System.out.println(i);
        };

        consumer.accept(4);
    }
}
