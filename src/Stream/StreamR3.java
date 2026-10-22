package Stream;

import java.util.Comparator;
import java.util.List;

public class StreamR3 {
    public static void main(String args[]){
        System.out.println("welcome to the stream:");
        List<Integer> list = List.of(40, 10, 30, 20, 10, 40, 50);
        list.stream()
                .distinct()
                .sorted(Comparator.naturalOrder())
                .forEach(System.out::println);
    }
}
