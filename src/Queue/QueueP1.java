package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueP1 {
    public static void main(String args[]){
        System.out.println("welocme to the queue practice:");
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println("the Queue is: " +q);
        q.poll();
        q.offer(40);
        System.out.println("front element is: " +q.peek());
        System.out.println("Final queue is: " +q);
        System.out.println("size is : " +q.size());
    }
}
