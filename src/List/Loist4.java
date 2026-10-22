package List;

import java.util.ArrayList;
import java.util.List;

public class Loist4 {
    public static void main(String args[]){
        System.out.println("welocme to the list hard question:");
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        //Operations
        list.add(3,100);
        list.remove(Integer.valueOf(50));
        list.set(6,700);
        list.addFirst(5);
        list.addLast(900);
        System.out.println(list.contains(100));
        System.out.println(list.indexOf(700));
        System.out.println(list.size());

        System.out.println(list);
    }
}
