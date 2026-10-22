package Linkedlist;

import java.util.LinkedList;

public class LinkedlistP1 {
    public static void main(String args[]){
        System.out.println("welocme to the linkedlist practice:");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.addFirst(5);
        list.addLast(60);
        list.set(3,300);
        list.removeFirst();
        list.remove(Integer.valueOf(40));
        System.out.println("First element is " +list.getFirst());
        System.out.println("last element is " +list.getLast());
        System.out.println("final list is " +list);
        System.out.println("size of list is " +list.size());





    }
}
