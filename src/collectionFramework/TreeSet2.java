package collectionFramework;

import java.util.TreeSet;

public class TreeSet2 {
    public static void main(String args[]){
        System.out.println("welcome to TreeSet:");
        TreeSet<Integer> t1 = new TreeSet<>();
        t1.add(50);
        t1.add(20);
        t1.add(10);
        t1.add(40);
        t1.add(30);
        t1.add(60);
        t1.add(10);
        System.out.println("TreeSet elemetents are:");
        System.out.println(t1);
    }
}
//q1.[10, 20, 30, 40, 50, 60]
//Q2.ascending order(sorted)
//Q3.because 10 is duplicates elememnts and treeset does not allow duplicates so it prints only once.
