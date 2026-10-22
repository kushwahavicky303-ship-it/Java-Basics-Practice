package Stream;

import java.util.List;

public class StreamR5 {
    public static void main(String args[]){
        System.out.println("welcome to the streams:");
        List<Integer> list = List.of(10, 20, 30, 40, 50);
        long result = list.stream()
                .filter(x->x>25)
                .count();
        System.out.println(result);

    }
}
