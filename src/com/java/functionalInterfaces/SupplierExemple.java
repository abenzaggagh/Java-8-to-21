package src.com.java.functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import src.com.java.data.Student;
import src.com.java.data.StudentDatabase;

public class SupplierExemple {
    
    public static void main(String[] args) {
        Supplier<Student> supplier = () -> {
            return new Student("Alice", 10, 3.5, "Female", Arrays.asList("Basketball", "Chess"), 2);
        };

        Supplier<List<Student>> supplierList = () -> {
            return StudentDatabase.getAllStudents();
        };

        System.out.println(supplier.get());

        System.out.println(supplierList.get());
    }

}
