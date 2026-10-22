package collectionFramework;

import java.util.HashSet;
import java.util.Set;

public class Set2 {
    public static void main(String args[]){
        System.out.println("welcome to set Initerface:");
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20);
        set.add(10);
        set.add(50);
        System.out.println(set);
        System.out.println(set.size());
    }
}
//Q1.int
//Q2.5
//Q3.because set does not allow duplicates elements so first check set then elements comes 5 so size is 5
