package Stream;

import java.util.List;

public class StreamT5 {
    public static void main(String args[]){
        System.out.println("welcome to the anyMatch():");
        List<Integer> list = List.of( 10, 20, 30, 40, 50, 60);
        boolean result = list.stream()
//                .filter(x->x>50)
                .anyMatch(x->x>50);
        System.out.println(result);
    }
}
