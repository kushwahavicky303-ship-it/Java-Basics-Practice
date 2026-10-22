package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionP1 {
    public static void main(String args[]){
        System.out.println("Welcome to collection practice:");
        Collection<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        c.add(50);

        System.out.println(c);
    }
}
