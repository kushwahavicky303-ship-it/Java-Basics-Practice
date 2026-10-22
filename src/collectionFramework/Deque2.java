package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque2 {
    public static void main(String args[]){
        System.out.println("welcome to Deque:");
        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("java");
        dq.addLast("python");
        dq.offerFirst("c++");
        dq.offerLast("html");
        dq.addLast("css");
        dq.offerLast("javascript");
        System.out.println("complete Deque:");
        System.out.println(dq);
        System.out.println("Access element:");
        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());

        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        System.out.println("Remove ELements:");
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());

        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println("Deque elements after all operation:");
        System.out.println(dq);

    }
}
