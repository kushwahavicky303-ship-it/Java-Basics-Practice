package Stream;

import java.util.ArrayList;
import java.util.List;

public class Stream2 {
    public static void main(String args[]){
        System.out.println("Welcome to stream filter():");
        List<Integer> list = new ArrayList<>(List.of(10,20,30,40,50));
        list.stream()
                .filter(x-> x>30)
                .forEach(System.out::println);
    }
}
