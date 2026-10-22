package Stream;

import java.util.List;

public class StreamR4 {
    public static void main(String args[]){
        System.out.println("welcome to the streams:");
        List<Integer> list = List.of(10, 20, 30, 40, 50, 60, 70);
        list.stream()
                .skip(2)
                .limit(3)
                .forEach(System.out::println);
    }
}
