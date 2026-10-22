package collectionFramework;

import java.util.LinkedList;

public class LinkedList3 {
    public static void main(String args[]){
        System.out.println("welcome to getFirst and getLast() method:");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Before getFirst() and getLast() method\n");
        System.out.println(list);

        System.out.println("After getFirst() method:\n");
        System.out.println(list.getFirst());//getFirst() does not remove the elements:

        System.out.println("after getLast() method:");
        System.out.println(list.getLast());//getLast() does not remove the element:
    }
}
//return type E