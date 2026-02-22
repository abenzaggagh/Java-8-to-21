package src.com.java.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExemple {
    
    static UnaryOperator<String> unaryOperator = (str) -> str.concat("default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("java8"));
    }

}
