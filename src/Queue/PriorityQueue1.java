package Queue;

import java.util.PriorityQueue;

public class PriorityQueue1 {
    public static void main(String args[]){
        System.out.println("welcome to the priorityqueue:");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(40);
        pq.add(10);
        pq.add(30);
        pq.add(20);
        System.out.println("Front element: " +pq.peek());
        System.out.println(" first removed element: " +pq.poll());
        System.out.println(" second removed element: " +pq.poll());
        System.out.println("final queue is: " +pq);
        System.out.println("the size is: " +pq.size());
    }
}
