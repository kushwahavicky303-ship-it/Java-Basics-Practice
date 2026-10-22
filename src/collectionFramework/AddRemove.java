package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class AddRemove {
    public static void main(String args[]){
        System.out.println("welcome to all methods of collections:");
        // Creating a Collection object using ArrayList
        Collection<String> c = new ArrayList<>();
        // Adding elements
        c.add("Java");
        c.add("python");
        c.add("c++");
        c.add("Html");
        c.add("css");
        System.out.println(c);// Printing collection before removal
        c.remove("Html");// Removing Html from collection
        System.out.println(c); // Printing collection after removal


    }
}
