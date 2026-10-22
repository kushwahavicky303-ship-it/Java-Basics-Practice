package collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque1 {
    public static void main(String args[]){
        System.out.println("welcome to Deque:\n");
        Deque<String> dq = new ArrayDeque<>();
        dq.addFirst("java");
        dq.addFirst("python");
        dq.addLast("html");
        dq.addLast("css");
        dq.addLast("javascript");
        System.out.println("original Deque:");
        System.out.println(dq);
        System.out.println("element at front:");
        System.out.println(dq.getFirst());
        System.out.println("element at rear");
        System.out.println(dq.getLast());



    }
}
//q1.boolean
//q2.boolean
//q3.yes
//q4.not allowed null
