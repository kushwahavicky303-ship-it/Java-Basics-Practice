package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Iterable1 {
    public static void main(String args[]){
        System.out.println("welcome to iterable interface:");
        Collection<Integer> collection = new ArrayList<>();
        collection.add(10);
        collection.add(10);
        collection.add(30);
        //Get iterator
        Iterator<Integer> iterator = collection.iterator();
        System.out.println(iterator.hasNext());

    }
}
