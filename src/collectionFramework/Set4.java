package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Set4 {
    public static void main(String args[]){
        System.out.println("welcome to set interfaces:");
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("C++");
        set.add("HTML");
        System.out.println("set Interface:");
        System.out.println(set);

        System.out.println("cheking elements:");
        System.out.println(set.contains("Python"));
        System.out.println(set.contains("CSS"));
    }
}
//Q1.bollean
//Q2.object o
//Q3.true
//Q4.false
//Q5.
