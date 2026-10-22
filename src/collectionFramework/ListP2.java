package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListP2 {
    public static void main(String args[]){
        System.out.println("welcome to list Interface:");
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
//        list.add(1,15);
//        System.out.println(list);
        System.out.println(list.get(2));


    }
}
