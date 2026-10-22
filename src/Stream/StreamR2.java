package Stream;

import java.util.List;

public class StreamR2 {
    public static void main(String args[]){
        System.out.println("welcome to the streams :");
        List<Integer> list = List.of(10, 15, 20, 25, 30, 35);
        list.stream()
                .filter(x->x>20)
                .map(x->x*2)
                .forEach(System.out::println);
    }
}
