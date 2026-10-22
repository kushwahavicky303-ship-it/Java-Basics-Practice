package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class addAll {
    public static void main(String args[]){
        System.out.println("welcome to addAll method:");
        //creating first collection 1 object using ArrayList
        Collection<String> c1 = new ArrayList<>();
        c1.add("Java");
        c1.add("python");
        c1.add("c++");
        System.out.println("before addAll");
        System.out.println(c1);
        //collection 2 object using ArrayList
        Collection<String> c2 = new ArrayList<>();
        c2.add("HTML");
        c2.add("CSS");
        c2.add("JavaScript");
        System.out.println("Collection 2");
        System.out.println(c2);
        c1.addAll(c2);
        System.out.println("after addAll");

        System.out.println(c1);



    }
}
