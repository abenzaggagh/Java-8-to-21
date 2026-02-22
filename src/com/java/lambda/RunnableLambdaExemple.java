package src.com.java.lambda;

public class RunnableLambdaExemple {
    
    public static void main(String[] args) {
        /**
         * Prior to Java 8
         *  */    

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running in a thread");
            }
        };

        new Thread(runnable).start();

        /**
         * With Java 8
         *  */

        Runnable lambdaRunnable = () -> System.out.println("Running in a thread with Lambda");

        new Thread(lambdaRunnable).start();

        new Thread(() -> System.out.println("Running in a thread with Lambda without variable")).start();

        new Thread(() -> {
            System.out.println("Running in a thread with Lambda with block");
            System.out.println("This is another line in the block");
        }).start();
    }    
}
