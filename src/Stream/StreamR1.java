package Stream;

import java.util.List;

public class StreamR1 {
    public static void main(String args[]){
        System.out.println("welcome to the stream :");
        List<Integer> list = List.of(10, 15, 20, 25, 30);
        list.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);
    }
}
