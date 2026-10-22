package Queue;

import java.sql.SQLOutput;
import java.util.LinkedList;
import java.util.Queue;

public class QueueP2 {
    public static void main(String args[]){
        System.out.println("welpcme to the queue interface:");
        Queue<String> q = new LinkedList<>();
        q.add("Java");
        q.add("Python");
        q.add("C++");
        System.out.println("The queue is: " +q);
        q.remove();
        q.offer("JavaScript");
        System.out.println("Front element: " +q.peek());
        q.poll();
        System.out.println("Final Queue: " +q);
        System.out.println("queue size is: " +q.size());

    }
}
