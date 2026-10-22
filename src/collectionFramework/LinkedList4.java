package collectionFramework;

import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String args[]){
        System.out.println("welcome to removeFirst() and removeLast() method:\n");
        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("mango");
        list.add("banana");
        list.add("orange");
        System.out.println("LinkedList before removeFirst() and removeLast():\n");
        System.out.println(list);

        list.removeFirst();
        System.out.println("linkedList after removeFirst()\n");
        System.out.println(list);

        list.removeLast();
        System.out.println("Linkedlist after removeLast()\n");
        System.out.println(list);
    }
}
