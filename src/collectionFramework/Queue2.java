package collectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class Queue2 {
    public static void main(String args[]){
        Queue<String> q1 = new LinkedList<>();
        System.out.println("Welcome to queue:\n");
        q1.add("java");
        q1.add("python");
        q1.add("c++");
        q1.add("html");
        q1.add("css");
        q1.offer("javascript");
        q1.offer("sql");
        System.out.println("Queue elements:");
        System.out.println(q1);//[java,python,c++,html,css,javascript,sql]
        System.out.println("first element;");//java
        System.out.println(q1.element());
        System.out.println("first element:");//java
        System.out.println(q1.peek());
        System.out.println("remove one element:");
        System.out.println(q1.remove());//java-->[python,c++,html,css,javascript,sql]
        System.out.println("remove elements:");
        System.out.println(q1.poll());//python-->[c++,html,css,javascript,sql]
        System.out.println("queue elements:");
        System.out.println(q1);//[c++,html,css,javascript,sql]



    }
}
