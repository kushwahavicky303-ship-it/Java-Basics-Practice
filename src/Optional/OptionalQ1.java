package Optional;

import java.util.Optional;

public class OptionalQ1 {
    public static void main(String args[]){
        System.out.println("welcome to the optional practice session:");
        Optional<String> optional = Optional.of("Aditya");
        System.out.println("value using isPresent: " +optional.isPresent());
        System.out.println("value using ifPresent: ");
        optional.ifPresent(System.out::println);
        System.out.println(optional.map(String::length).orElse(0));
    }
}
//Q1.the main purpose of the optional class is to avoid NullPointerException by safely handling null Values.
//Q2.optional.of() is used when u are 100 percent sure that the values is not null. and
//optional.ofNullable is the most commanly used method .
//Q3.orElse() return the value ,if present otherwise it return the default value.