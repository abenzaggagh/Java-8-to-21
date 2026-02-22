package src.com.java.functionalInterfaces;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemple {

    static Comparator<Integer> comparator = (s1, s2) -> s1.compareTo(s2);
    
    static BinaryOperator<Integer> binaryOperator = (s1, s2) -> {
        return s1 + s2;
    };

    static BinaryOperator<Integer> maxBy = BinaryOperator.maxBy(comparator);

    static BinaryOperator<Integer> minBy = BinaryOperator.minBy(comparator);

    public static void main(String[] args) {
        System.out.println(binaryOperator.apply(10, 20));

        System.out.println(maxBy.apply(10, 20));

        System.out.println(minBy.apply(10, 20));
    }

}
