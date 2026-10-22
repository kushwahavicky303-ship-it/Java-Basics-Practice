package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeP1 {
    public static void main(String args[]){
        System.out.println("welocme to the Deque:");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(50);
        dq.addFirst(20);
        dq.addLast(30);
        dq.addFirst(10);
        System.out.println("Deque is: " +dq);
        System.out.println("front element: " +dq.peekFirst());
        System.out.println("Rear element: " +dq.peekLast());
        dq.removeFirst();
        dq.removeLast();
        System.out.println("Final Deque is: " +dq);

    }
}
