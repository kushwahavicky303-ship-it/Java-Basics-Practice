package Stream;

import java.util.Comparator;
import java.util.List;

public class StreamP7 {
    public static void main(String args[]){
        System.out.println("welcome to the hard questions:");
        List<Integer> list = List.of( 5, 10, 15, 20, 25, 30, 20, 15, 35, 40);
        list.stream()
                .filter(x->x%5==0)
                .map(x->x*4)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .limit(2)
                .forEach(System.out::println);
    }
}
