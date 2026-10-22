package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionP8 {
    public static void main(String args[]) {
        System.out.println("Welcome to removeAll():");
        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(10);
        collection1.add(20);
        collection1.add(30);
        collection1.add(40);
        collection1.add(50);
        //create Collection2
        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(20);
        collection2.add(40);
        collection1.containsAll(collection2);
        System.out.println(collection1);
    }
}
