package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class collectionP5 {
    public static void main(String args[]){
        System.out.println("welcome to collection framework:");
        Collection<Integer> collection = new ArrayList<>();
        collection.add(10);
        collection.add(20);
        collection.add(30);
        collection.add(40);
        collection.add(50);
        collection.add(60);
        collection.add(70);
        collection.add(80);
        collection.add(90);
        collection.add(100);
        System.out.println("Collection is:");
        System.out.println(collection);

        System.out.println("Contains elements:");
        System.out.println(collection.contains(70));

        System.out.println("after remove:");
        System.out.println(collection.remove(60));
        System.out.println("the size is;");
        System.out.println(collection.size());
        System.out.println("collection is empty or not:");
        System.out.println(collection.isEmpty());
        System.out.println("After all operation:");
        System.out.println(collection);
    }
}
