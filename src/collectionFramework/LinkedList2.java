package collectionFramework;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String args[]){
        System.out.println("welcome to addLst():");
        LinkedList<String> list = new LinkedList<>();
        list.add("java");
        list.add("python");
        list.add("css");
        System.out.println("before addLast() method\n");
        System.out.println(list);

        list.addLast("html");
        System.out.println("after addLast() method\n");
        System.out.println(list);
    }
}
