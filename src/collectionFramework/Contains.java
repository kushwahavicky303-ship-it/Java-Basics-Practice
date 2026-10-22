package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Contains {
    public static void main(String args[]){
        System.out.println("welcome to collection method Contains:");
        Collection<String> c1 = new ArrayList<>();
        c1.add("java");
        c1.add("python");
        c1.add("c++");
        c1.add("html");
        c1.add("css");
        System.out.println("collection:");
        System.out.println(c1);

        System.out.println("is python present");
        System.out.println(c1.contains("python"));

        System.out.println("is javaScript present");
        System.out.println(c1.contains("javascript"));
    }
}
