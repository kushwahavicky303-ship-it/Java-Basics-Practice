package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Set1 {
    public static void main(String args[]){
        System.out.println("welcome to set interface:");
        Set<String> set =new HashSet<>();
        set.add("java");
        set.add("python");
        set.add("c++");
        set.add("java");
        set.add("html");
        set.add("python");
        set.add("css");
        System.out.println(set);
    }
}
//Q1."Java" and "Python" printed only once because set interface does not allowed duplicates elements.
