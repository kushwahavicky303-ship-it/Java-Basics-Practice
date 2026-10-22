package collectionFramework;

import java.util.*;

public class List1methods {
    public static void main(String args[]){
        System.out.println("welcome to list methods:");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        //get(index) method
        System.out.println(list.get(1));

        list.set(1,5);//set(index,value) method
        System.out.println(list);

        list.addAll(0,List.of(9,7,8));
        System.out.println(list);
        //after removing element
        list.remove(0);
        System.out.println(list);

    }
}
