package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionR1 {
    public static void main(String args[]){
        System.out.println("welocme to the collection practice:");
        Collection<Integer> c1 = new ArrayList<>();
        c1.add(10);
        c1.add(20);
        c1.add(30);
        c1.add(40);
        c1.add(50);
        System.out.println(c1);
        System.out.println(c1.size());
        System.out.println(c1.contains(30));
        c1.remove(20);
        System.out.println(c1);
    }
}

