package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Collectionp6 {
    public static void main(String args[]){
        System.out.println("welcome to addAll():");
        Collection<Integer> collection1 = new ArrayList<>();
        collection1.add(10);
        collection1.add(20);
        collection1.add(30);
        //creeate collection2
        Collection<Integer> collection2 = new ArrayList<>();
        collection2.add(40);
        collection2.add(50);
        collection1.addAll(collection2);
        System.out.println(collection1);
      }
}
