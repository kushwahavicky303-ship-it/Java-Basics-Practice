package Stream;

import java.util.ArrayList;
import java.util.List;

public class Stream1 {
    public static void main(String args[]){
        System.out.println("welcome to filter():");
        List<Integer> list = new ArrayList<>(List.of(10,20,30,40,50));
        list.stream()
                .filter(x-> x>10)
                .forEach(System.out::println);





    }
}
