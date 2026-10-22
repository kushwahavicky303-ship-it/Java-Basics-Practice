package Queue;

import java.util.PriorityQueue;

public class PriorityQueue3 {
    public static void main(String args[]){
        System.out.println("welcome to the queue:");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(45);
        pq.add(10);
        pq.add(35);
        pq.add(5);
        pq.add(25);
        pq.add(15);
        System.out.println("front element: " +pq.peek());
        pq.poll();
        pq.poll();
        pq.add(2);
        pq.add(50);
        System.out.println("again front element: " +pq.peek());
        System.out.println("Removing all elements:");

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
