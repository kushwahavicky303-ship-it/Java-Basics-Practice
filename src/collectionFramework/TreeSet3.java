package collectionFramework;

import java.util.TreeSet;

public class TreeSet3 {
    public static void main(String args[]){
        System.out.println("welcome to TreeSet:\n");
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(80);
        t1.add(20);
        t1.add(50);
        t1.add(10);
        t1.add(40);
        t1.add(90);
        t1.add(60);
        System.out.println("treeSte is:");
        System.out.println(t1);

        System.out.println("smallest element:");
        System.out.println(t1.first());
        System.out.println("Last (larger) element:");
        System.out.println(t1.last());
        System.out.println("higher element:");
        System.out.println(t1.higher(70));
        System.out.println("lower elemet:");
        System.out.println(t1.lower(20));
        System.out.println("pollfirst is:");
        System.out.println(t1.pollFirst());
        System.out.println("polllast is:");
        System.out.println(t1.pollLast());
        System.out.println("after the all methods:");
        System.out.println(t1);



    }
}
