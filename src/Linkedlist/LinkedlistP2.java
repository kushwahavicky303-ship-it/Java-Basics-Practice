package Linkedlist;

import java.util.LinkedList;

public class LinkedlistP2 {
    public static void main(String args[]){
        System.out.println("welocome to the linkedlist practice:");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.offerFirst(5);
        list.offerLast(60);
        System.out.println("front element: " +list.peekFirst());
        System.out.println("remove front element: " +list.pollFirst());
        System.out.println("Front element: " +list.getFirst());
        System.out.println("End element: " +list.getLast());
        System.out.println("the final list is: " +list);
        System.out.println("the size is: " +list.size());

    }
}
