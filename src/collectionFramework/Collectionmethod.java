package collectionFramework;

import java.util.ArrayList;
import java.util.Collection;

public class Collectionmethod {
    public static void main(String args[]){
        System.out.println("welcome to colletion interface:");
        Collection<String> c1 = new ArrayList<>();
        c1.add("box1");
        c1.add("box2");
        c1.add("box3");
        c1.add("box4");
        c1.add("box5");
        //System.out.println(c1);
        Collection<String> c2 = new ArrayList<>();
        c2.add("box6");
        c2.add("box7");
        c2.add("box8");
        c1.addAll(c2);
        System.out.println(c1);

    }
}
