package Stream;

import java.util.List;

public class Stream10 {
    public static void main(String args[]){
        System.out.println("Welcome to Stream():");
        List<String> list = List.of("Python","Java","Spring","HTML","CSS");
        list.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
