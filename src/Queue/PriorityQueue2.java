package Queue;

import java.util.PriorityQueue;

public class PriorityQueue2 {
    public static void main(String args[]){
        System.out.println("welocme to the queue practice: ");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(50);
        pq.add(10);
        pq.add(40);
        pq.add(20);
        pq.add(30);
        System.out.println("queue is:" +pq);
        System.out.println("front element is: " +pq.peek());
         pq.poll();
         pq.poll();
         pq.poll();
        System.out.println("final Queue is: " +pq);
        System.out.println("size of Queue: "+pq.size());

    }
}
