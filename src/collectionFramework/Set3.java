package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Set3 {
    public static void main(String args[]){
        System.out.println("welcome to set interfaces:\n");
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Orange");
        set.add("Grapes");
        System.out.println("before removing elements\n");
        set.remove("Banana");
        System.out.println("after removing");
        System.out.println(set);
    }
}
//Q1.boolean
//Q2.?
//q3.?
