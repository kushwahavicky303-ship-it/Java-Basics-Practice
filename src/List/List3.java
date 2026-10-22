package List;

import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String args[]){
        System.out.println("welcome to the list practices :");
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        list.add(35);
        list.add(40);
        list.add(2,100);
        list.remove(Integer.valueOf(25));
        list.set(5,300);
        list.addFirst(500);
        list.addLast(600);
        System.out.println(list.contains(100));
        System.out.println(list.indexOf(35));
        System.out.println("Final List is " +list);
    }
}
