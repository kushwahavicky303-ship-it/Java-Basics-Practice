package Stream;

import java.util.List;

public class StreamR6 {
    public static void main(String args[]){
        System.out.println("welcome to the stream:");
        List<Integer> list = List.of(40,10,30,20,50);
        int min = list.stream()
                .min(Integer::compareTo)
                .get();
        int max = list.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(min);
        System.out.println(max);
    }
}
