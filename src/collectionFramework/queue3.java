package collectionFramework;

import java.util.PriorityQueue;
import java.util.Queue;

public class queue3 {
    public static void main(String args[]){
        Queue<Integer> q = new PriorityQueue<>();

        q.add(30);
        q.add(10);
        q.add(20);

       System.out.println(q);

        System.out.println(q.poll());

        System.out.println(q);

        System.out.println(q.peek());
    }
}
