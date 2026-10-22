package Stream;

import java.util.List;

public class StreamT1 {
    public static void main(String args[]){
        System.out.println("welcome to terminal operations:");
        List<Integer> list = List.of(10,15,20,25,30,35,40,45,50);
        long Count =list.stream()
                .filter(x->x>20)
                .filter(x->x%2==0)
                .count();
        System.out.println(Count);

    }
}
