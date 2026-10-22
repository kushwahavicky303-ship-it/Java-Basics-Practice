package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class collectionR4 {
    public static void main(String args[]){
        System.out.println("collection interface practice 4:");
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
        System.out.println(c1.contains(30));
        System.out.println(c1.containsAll(c2));
        System.out.println(c1.remove(20));
        System.out.println(c1);
        System.out.println(c1.removeAll(c2));
        System.out.println("after removeAll the collections is" +c1);
        c1.add(30);
        c1.add(40);
        c1.add(50);
        System.out.println(c1.retainAll(c2));
        System.out.println("Final collection is " +c1);


    }
}
