package collectionFramework;


import java.util.ArrayList;
import java.util.Collection;

public class containsAll {
    public static void main(String args[]){
        System.out.println("welcome to containsAll method:");
        Collection<String> c1 = new ArrayList<>();
        c1.add("java");
        c1.add("python");
        c1.add("c++");
        c1.add("html");
        c1.add("css");
        System.out.println("Collection 1:");
        System.out.println(c1);

        Collection<String> c2 = new ArrayList<>();
        c2.add("python");
        c2.add("html");
        System.out.println("Collection 2:");
        System.out.println(c2);

        System.out.println("collection 2 contains collection 2 :");
        System.out.println(c1.containsAll(c2));


    }
}
