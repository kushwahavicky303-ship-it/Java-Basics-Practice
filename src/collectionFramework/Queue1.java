package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String args[]){
        System.out.println("Welcome to Queue:");
        Queue<Integer> q1 = new LinkedList<>();
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        System.out.println("Queue interfaces :");
        System.out.println(q1);
        System.out.println("remove one element:");
        System.out.println(q1.remove());
        System.out.println("Queue is:");
        System.out.println(q1);
        System.out.println("Front element:");
        System.out.println(q1.element());
        System.out.println("the size is:");
        System.out.println(q1.size());
    }
}
