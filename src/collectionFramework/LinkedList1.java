package collectionFramework;

import java.util.LinkedList;

public class LinkedList1 {
    public static void main(String args[]){
        System.out.println("welcome to addFrist():");
        LinkedList<String> list = new LinkedList<>();
        list.add("Java");
        list.add("python");
        list.add("css");
        System.out.println("before addFirst() method:");
        System.out.println(list);

        list.addFirst("html");
        System.out.println("\nafter addFirst() method");
        System.out.println(list);

    }
}
//return type=void
