package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class List5addAll {
    public static void main(String args[]){
        System.out.println("welcome to addAll(boolean)");
        //creating List1
        List<String> list1 = new ArrayList<>();
        list1.add("Java");
        list1.add("Python");
        list1.add("C++");
        //creating List2
        List<String> list2 = new ArrayList<>();
        list2.add("HTML");
        list2.add("CSS");
        list2.add("JavaScript");

        //Before addAll
        System.out.println("\n list1 before addAll():");
        System.out.println(list1);

        System.out.println("\n list2 before addAll():");
        System.out.println(list2);

        // Adding all elements of List 2 into List 1
        boolean result = list1.addAll(list2);

        // Return value of addAll()
        System.out.println("\naddAll() returned:");
        System.out.println(result);

        //after addAll()
        System.out.println("\nlist1 after addAll():");
        System.out.println(list1);



    }
}
