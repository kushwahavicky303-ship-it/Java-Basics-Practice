package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeP5 {
    public static void main(String args[]){
        System.out.println("welcome to the deque practice:");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.add(10);
        dq.add(20);
        dq.add(30);
        dq.add(40);
        System.out.println("THe deque is:" +dq);
        dq.removeFirst();
        dq.removeLast();
        System.out.println("Remaining Deque is: " +dq);
        dq.pollFirst();
        dq.pollLast();
        System.out.println("FInal Deque is:");
        System.out.println(dq.isEmpty());
    }
}
//Q1.removeFirst(): it removes the front element of the queue.and PollFirst(): it returns the top element and remove it
//Q2.when pollLast() is callled on empty deque then the system will show null
//Q3.arraydeque