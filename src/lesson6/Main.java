package lesson6;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // non primitive types
        String name = new String("John");
        System.out.println(name.toUpperCase());
        LocalDate date = LocalDate.now();
        System.out.println(date.getMonth());
    }
}
