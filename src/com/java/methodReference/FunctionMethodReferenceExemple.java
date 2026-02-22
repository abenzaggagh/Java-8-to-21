package src.com.java.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExemple {
    
    static Function<String, String> toUpperCase = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("hello"));
    }
}
