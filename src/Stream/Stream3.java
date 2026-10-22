package Stream;

import java.util.List;

public class Stream3 {
    public static void main(String args[]){
        System.out.println("Welcome to Stream filter():");
        List<Integer> list = List.of(5,10,15,20,25,30);
        list.stream()
                .filter(x-> x%2!=0)
                .forEach(System.out::println);


    }
}
