package Stream;

import java.util.List;

public class StreamP3 {

    public static void main(String args[]){
        System.out.println("welcome to the Stream method():");
        List<Integer> list = List.of( 5, 10, 15, 20, 15, 25, 30, 20, 35);
        list.stream()
                .filter(x->x>10)
                .map(x->x*3)
                .distinct()
                .sorted()
                .forEach(System.out::println);



        }

    }//dont the solution of correct question if correct then moove to the question


