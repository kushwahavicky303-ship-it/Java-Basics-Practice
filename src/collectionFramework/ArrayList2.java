package collectionFramework;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args){
        System.out.println("welcome to ensureCapicity:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("before call ensureCapacity():");
        System.out.println(list);

        list.ensureCapacity(15);
        System.out.println("after call ensureCapacity():");
        System.out.println(list);

    }
}
//Q1.void
//yes

