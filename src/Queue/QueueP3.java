package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueP3 {
    public static void main(String args[]){
        System.out.println("Welcome to the queue");
        Queue<Integer> q = new LinkedList<>();
        q.add(5);
        q.add(10);
        q.add(15);
        q.add(20);
        int first = q.poll();
        int second = q.poll();
        q.add(25);
        q.add(30);
        System.out.println("first removed element: " +first);
        System.out.println("second removed element: " +second);
        System.out.println("front element: " +q.peek());
        System.out.println("Final queue: " +q);
        System.out.println("size of queue: " +q.size());

    }
}
