package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeP3 {
    public static void main(String args[]){
        System.out.println("welocme to the deque:");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(40);
        dq.offerFirst(20);
        dq.offerLast(60);
        dq.offerFirst(10);
        System.out.println("deque is: " +dq);
        System.out.println("front element: " +dq.peekFirst());
        System.out.println("Rear element: " +dq.peekLast());
        dq.pollFirst();
        dq.pollLast();
        System.out.println("Final Deque is: " +dq);
    }
}
