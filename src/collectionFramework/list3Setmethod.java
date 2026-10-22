package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class list3Setmethod {
    static void main(String[] args) {
        System.out.println("welcome to set() method:");
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("c++");
        list.add("Html");
        list.add("css");
        System.out.println("before setmethod" +list);
        System.out.println("after replacing python:");
        list.set(1,"JavaScript");
        System.out.println( list);
        System.out.println("after replacing Html");
        list.set(3,"react");
        System.out.println(list);


    }
}
