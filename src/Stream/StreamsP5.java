package Stream;

import java.util.Comparator;
import java.util.List;

public class StreamsP5 {
    public static void main(String args[]){
        System.out.println("welcome to the methods:");
        List<Integer> list = List.of(  5, 3, 9, 5, 7, 1, 9, 11, 13);
        list.stream()
                .filter(x->x%2!=0)
                .map(x->x*2)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(System.out::println);

    }
}
