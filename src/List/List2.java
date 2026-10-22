package List;

import java.util.ArrayList;
import java.util.List;

public class List2 {
    public static void main(String args[]){
        System.out.println("welcome to the list practices:");
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.addFirst(100);
        list.addLast(200);
        list.set(3,400);
        list.remove(1);
        System.out.println( list.contains(60));
        System.out.println(list.indexOf(50));
        System.out.println("FInal List is:" +list);




    }
}
