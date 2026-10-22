package Stream;


import java.util.List;
import java.util.Optional;

public class StreamT4 {
    public static void main(String args[]){
        System.out.println("welcome to terminal operation findFirst():");
        List<Integer> list = List.of( 5, 10, 15, 22, 30, 40);

        Optional<Integer> result = list.stream()
                .filter(x->x%2==0)
                .filter(x->x>20)
                .findFirst();
        System.out.println(result);
//        System.out.println(result.get());->it will print such as 22
    }
}
