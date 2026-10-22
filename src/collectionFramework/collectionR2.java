package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class collectionR2 {
    public static void main(String args[]){
        System.out.println("welocme to the collection practices:");
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);
        Collection<Integer> c2 = new ArrayList<>();
        c2.add(30);
        c2.add(40);
        c2.add(50);
        c2.add(60);
        c2.add(70);
        System.out.println(c1.containsAll(c2));
        System.out.println("size =" + c1.size());
        System.out.println(c1.isEmpty());
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println("After addAll the size is " +c1.size());
        c1.clear();
        System.out.println("After clear" +c1);
        System.out.println(c1.isEmpty());
    }
}
