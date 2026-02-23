package src.com.java.lambda;

import java.util.Comparator;

public class ComparatorLambdaExemple {
    
    public static void main(String[] args) {
        /* 
         * Prior to Java 8
         *  */

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
                // 0 -> o1 and o2 are equal
                // positive -> o1 is greater than o2
                // negative -> o1 is less than o2
            }
        };

        System.out.println("Comparing 5 and 10 using Comparator: " + comparator.compare(5, 10));
    
        /* 
         * With Java 8
         *  */

        Comparator<Integer> lambdaComparator = (o1, o2) -> o1.compareTo(o2);

        System.out.println("Comparing 5 and 10 using Lambda Comparator: " + lambdaComparator.compare(5, 10));
    }

}
