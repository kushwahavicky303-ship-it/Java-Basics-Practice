package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1 {
    public static void main(String args[]){
        System.out.println("welcome to iterable interface:");
        //creating an arraylist
        ArrayList <String> list = new ArrayList<>();
        //Adding elements
        list.add("java");
        list.add("python");
        list.add("c++");
        list.add("javascript");
        list.add("html");
        //creating an Iterator object
        Iterator<String> itr = list.iterator();

        //Traversing the collection
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
