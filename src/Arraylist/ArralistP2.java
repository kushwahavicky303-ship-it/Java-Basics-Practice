package Arraylist;

import java.util.ArrayList;

public class ArralistP2 {
    public static void main(String args[]) {
        System.out.println("welcome to the arraylist practice:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(1,100);
        list.remove(4);
        list.set(2,200);
        list.add(4,300);
        list.remove(Integer.valueOf(60));
        list.addLast(500);
        System.out.println("final list is: " +list);
        System.out.println("the size is: " +list.size());

    }
}