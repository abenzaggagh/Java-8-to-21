package src.com.java.functionalInterfaces;

import java.util.function.Function;

public class FunctionExemple {
    
    static Function<String, String> uppercase = (name) -> name.toUpperCase();

    static Function<String, String> addSomething = (name) -> name.toUpperCase().concat("default");

    public static void main(String[] args) {
        System.out.println("Result 1 is : " + uppercase.apply("java 8"));

        System.out.println("Result 2 is : " + uppercase.andThen(addSomething).apply("java 8"));

        System.out.println("Result 2 is : " + uppercase.compose(addSomething).apply("java 8"));
    }
}
