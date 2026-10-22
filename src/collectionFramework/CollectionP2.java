package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionP2 {
    public static void main(String args[]){
        System.out.println("welcome to cheking colletion is empty:");
        Collection<Integer> collection = new ArrayList<>();
        System.out.println("colection is empty:");
        System.out.println(collection.isEmpty());
        collection.add(100);
        System.out.println(collection.isEmpty());
    }
}
