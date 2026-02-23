package src.com.java.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CollectionsVsStreams {
    
    public static void main(String[] args) {
        
        ArrayList<String> names = new ArrayList<>();

        names.add("Amine");
        names.add("Camille");
        names.add("Hamid");

        names.remove(1);

        for (String name : names) {
            System.out.println(name);
        }

        for (String name : names) {
            System.out.println(name);
        }

        names.remove(0);

        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);
        // namesStream.forEach(System.out::println); // This will throw an exception because the stream has already been consumed
    }

}
