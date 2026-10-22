package Stream;

import java.util.Comparator;
import java.util.List;

public class practice {
    public static void main(String args[]){
        System.out.println("welcome to the practice of stream:");
        List<Integer> list = List.of(12, 5, 18, 7, 20, 3, 15, 10, 25, 8,
                18, 30, 7, 40, 15, 50);
        list.stream()
                .distinct()
                .filter(x->x>10)
                .map(x->x*x)
                .sorted()
                .filter(x->x<500)
                .limit(3)
                .reduce(0,(a,b)->a+b);

        }


        }


