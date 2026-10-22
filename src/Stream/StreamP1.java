package Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamP1 {
    public static void main(String args[]){
        System.out.println("welcomme to the Stream method():");
        List<Integer> list = new ArrayList<>(List.of(5, 8, 10, 13, 16, 21, 24));
        list.stream()
                .filter(x->x%2==0)
                .map(x->x*10)
                .forEach(System.out::println);
    }
}
