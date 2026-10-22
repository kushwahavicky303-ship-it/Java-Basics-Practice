package Stream;

import java.util.List;

public class Stream4 {
    public static void main(String args[]){
        System.out.println("welcome to map():");
        List<Integer> list = List.of(10,20,30);
        list.stream()
                .filter(x->x>15)
                .map(x->x*2)
                .forEach(System.out::println);
    }
}
