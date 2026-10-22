package List;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String args[]){
        System.out.println("welcome to the list practice:");
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list.get(2));
        list.set(1,100);
        System.out.println("after replacing:" +list);
        list.add(3,200);
        System.out.println("after insert:" +list);
        list.remove(4);
        System.out.println("after removing index:" +list);
        System.out.println("the final list is " +list);


    }
}
