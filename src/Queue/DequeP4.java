package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeP4 {
    public static void main(String args[]){
        System.out.println("welcome to the Deque:");
        Deque<Integer> dq = new ArrayDeque<>();
        dq.offerLast(100);
        dq.offerLast(200);
        dq.offerLast(300);
        dq.offerFirst(50);
        System.out.println("result of contains(200): " +dq.contains(200));
        System.out.println("size od Deque: " +dq.size());
        dq.pollFirst();
        dq.pollLast();
        dq.addFirst(25);
        System.out.println("Final deque is: " +dq);
        System.out.println("Every Removed elements:");
        while(!dq.isEmpty()){
            System.out.println(dq.pollLast());

        }
    }
}
//Q1.Deque is (double ended queue) is an interface that allows us insertion and deletion from both sides
//Q2.addFirst() insert the element at the front and offerFirst() also insert the element at the front and return boolean
//Q3.pollFirst() it return the front element and romove it and peekFirst() it return the front element
//without removing the elements