package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class List2get {
    public static void main(String args[]){
        System.out.println("welcome to get() method:");
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("python");
        list.add("c++");
        list.add("Html");
        list.add("css");
        //before get method
        System.out.println("before get() method:");
        System.out.println(list);

        System.out.println(list.get(0));
        System.out.println(list.get(4));
        System.out.println(list.get(2));



    }
}
