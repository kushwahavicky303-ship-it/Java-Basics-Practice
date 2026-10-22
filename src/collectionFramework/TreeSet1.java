package collectionFramework;

import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String args[]){
        System.out.println("welcome to TreeSet:");
        TreeSet<String> t1 = new TreeSet<>();
        t1.add("java");
        t1.add("python");
        t1.add("c++");
        t1.add("html");
        t1.add("css");
        t1.add("java");
        System.out.println("TreeSet are:");
        System.out.println(t1);

    }
}
//Q1.because treeset does not allow duplicates
//Q2.Use TreeSet when you want unique elements that are automatically stored in sorted order.
