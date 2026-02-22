package src.com.java.functionalInterfaces;

public class AnotherFunctionExemple {
    
    public static String performConcat(String str) {
        return FunctionExemple.addSomething.apply(str);
    }

    public static void main(String[] args) {
        System.out.println(performConcat("Hello"));
    }
}
