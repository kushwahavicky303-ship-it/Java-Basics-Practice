package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class List4addmethod {
    public static void main(String args[]){
        System.out.println("welcome to add() method:");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("before add() method:");
        System.out.println(list);

        list.add(2,8);
        System.out.println("\nafter inserting 8 at index 2");
        System.out.println(list);


    }
}
