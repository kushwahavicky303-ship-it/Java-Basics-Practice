package collectionFramework;

import java.util.ArrayList;

public class ArraytList3 {
    public static void main(String args[]){
        System.out.println("welcome to trimToSize():");
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");
        list.add("Orange");
        System.out.println("before trimToSize()");
        System.out.println(list);

        list.trimToSize();
        System.out.println("After tirmTosize()");
        System.out.println(list);



    }
}
//Q1.return type of trimtoSize() is void.
//Q2.trimToSize() does not remove any elements.
//Q3.trimToSize() changes he internal capacity ,not the list content
