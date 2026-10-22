package Linkedlist;

import java.util.LinkedList;

public class LinkedlistP3 {
    public static void main(String args[]){
        System.out.println("welcome to the linked list practice:");
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //Operations
        list.addFirst(5);
        list.addLast(60);
        System.out.println("Front element: " +list.peekFirst());
        System.out.println("Rear element: " +list.peekLast());
        System.out.println("Removed Rear element: " +list.pollLast());
        System.out.println("Removed Front element: " +list.pollFirst());
        System.out.println("Final list is: " +list);
        System.out.println("the size of list: " +list.size());

    }
}
