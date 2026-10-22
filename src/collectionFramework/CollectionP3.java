package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionP3 {
    public static void main(String args[]){
        System.out.println("welcome to collection framework:");
        Collection<Integer> collection = new ArrayList<>();
        collection.add(10);
        collection.add(20);
        collection.add(30);
        collection.add(40);
        collection.add(50);
        collection.remove(30);
        System.out.println("after remove the elements:");
        System.out.println(collection);
    }
}
