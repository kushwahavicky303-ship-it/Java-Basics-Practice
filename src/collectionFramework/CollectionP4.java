package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionP4 {
    public static void main(String args[]) {
        System.out.println("welcome to collection framework:");
        Collection<Integer> collection = new ArrayList<>();
        collection.add(100);
        collection.add(200);
        collection.clear();
        System.out.println(collection.isEmpty());
        System.out.println(collection.size());
    }
}
