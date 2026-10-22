package Stream;

import java.util.List;

public class StreamQ1 {
    public static void main(String args[]){
        System.out.println("welcome th the streams:");
        List<Integer> list = List.of( 5, 10, 15, 20, 25, 30, 35, 40);
        list.stream()
                .filter(x->x>15)
                .filter(x->x%2==0)
                .map(x->x*3)
                .sorted()
                .forEach(System.out::println);
    }
}
