package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeP6 {
    public static void main(String args[]) {
        System.out.println("welcome to the Deque:");
        Deque<String> dq = new ArrayDeque<>();
        dq.addLast("Java");
        dq.addLast("Python");
        dq.addFirst("C++");
        dq.addFirst("JavaScript");
        System.out.println("the deque is: " + dq);
        System.out.println("Front element: " + dq.peekFirst());
        System.out.println("Reaar element: " +dq.peekLast());
        dq.pollFirst();
        dq.pollLast();
        System.out.println("Final Deque is: " +dq);
        System.out.println(dq.contains("Java"));
    }
}