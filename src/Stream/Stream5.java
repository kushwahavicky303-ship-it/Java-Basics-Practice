package Stream;

import java.util.List;

public class Stream5 {
    public static void main(String args[]){
        System.out.println("welcome to map and fliter():");
        List<Integer> list = List.of(5,10,15,20,25,30,35);
        list.stream()
                .filter(x-> x>15)
                .map(x-> x*10)
                .forEach(System.out::println);
    }
}
