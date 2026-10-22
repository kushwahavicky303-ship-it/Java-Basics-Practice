package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ListP1 {
    public static void main(String args[]){
        System.out.println("welcome to List Interface:");
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

    }
}
