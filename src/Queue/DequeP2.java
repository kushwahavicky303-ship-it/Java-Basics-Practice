package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeP2 {
    public static void main(String args[]){
        System.out.println("welcome to the Deque:");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(100);
        dq.addLast(200);
        dq.addFirst(50);
        dq.addLast(300);
        System.out.println("Deque is: " +dq);
        dq.pollFirst();
        dq.pollLast();
        dq.addFirst(25);
        dq.addLast(400);
        System.out.println("The Final Deque is: " +dq);
        System.out.println("all front element:");
        while(!dq.isEmpty())
        {
            System.out.println(dq.pollFirst());
        }
    }
}
