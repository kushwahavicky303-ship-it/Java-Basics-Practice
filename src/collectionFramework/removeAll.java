package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class removeAll {
    public static void main(String args[]){
        System.out.println("welcome to removeAll method:");
        //collection1
        Collection<String> c1 = new ArrayList<>();
        c1.add("java");
        c1.add("python");
        c1.add("c++");
        c1.add("html");
        c1.add("css");
        c1.add("sql");
        System.out.println("collection1:");
        System.out.println(c1);
        //collection2
        Collection<String> c2 = new ArrayList<>();
        c2.add("python");
        c2.add("html");
        c2.add("sql");
        System.out.println("collection2:");
        System.out.println(c2);

        // Remove all common elements from Collection 1
        boolean result = c1.removeAll(c2);

        // Print the return value
        System.out.println("Remove operation successful:");
        System.out.println(result);

        // Print Collection 1 after removeAll()
        System.out.println("\nCollection 1 after removeAll():");
        System.out.println(c1);
    }
}
