package Stream;

import java.util.List;

public class StreamsT3 {
    public static void main(String args[]){
        System.out.println("welcome to terminal opr:");
        List<Integer> list = List.of( 6, 9, 12, 15, 18, 21, 24, 27);
        long result = list.stream()
                .filter(x->x%3==0)
                .map(x->x*10)
                .filter(x->x>200)
                .count();
        System.out.println(result);
    }
}
