package Arraylist;

import java.util.ArrayList;

public class ArraylistP1 {
    public static void main(String args[]){
        System.out.println("welcome to the arraylist practice:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(2,100);
        list.set(4,500);
        list.remove(1);
        list.addLast(900);
        System.out.println("Final List: " +list);
        System.out.println("size of list is: " +list.size());

    }
}
