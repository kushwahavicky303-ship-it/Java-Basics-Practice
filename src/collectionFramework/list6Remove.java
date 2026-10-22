package collectionFramework;

import java.util.ArrayList;
import java.util.List;

public class list6Remove {
    public static void main(String[] args){
        System.out.println("welcome to remove():");
        List<String> list = new ArrayList<>();
        list.add("monday");
        list.add("tuesday");
        list.add("wednesday");
        list.add("thursday");
        list.add("friday");
        list.add("saturday");
        list.add("sunday");
        System.out.println("\n Before remove():");
        System.out.println(list);
        //after removing elements:

        list.remove(1);
        System.out.println("\nafter remove():");
        System.out.println(list);



    }
}
