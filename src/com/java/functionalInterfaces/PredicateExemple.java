package src.com.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExemple {

    static Predicate<Integer> evenNumber = (number) -> number % 2 == 0;

    static Predicate<Integer> dividableBy5 = (number) -> number % 5 == 0;

    static void evenAndDividableBy5(Integer number) {
        System.out.println(evenNumber.and(dividableBy5).test(number));
    }

    static void evenOrDividableBy5(Integer number) {
        System.out.println(evenNumber.or(dividableBy5).test(number));
    }

    static void notEvenOrDividableBy5(Integer number) {
        System.out.println(evenNumber.or(dividableBy5).negate().test(number));
    }
    
    public static void main(String[] args) {
        System.out.println(evenNumber.test(1590));

        evenAndDividableBy5(1590);

        evenAndDividableBy5(5);

        evenOrDividableBy5(12);

        notEvenOrDividableBy5(5);
    }
}
