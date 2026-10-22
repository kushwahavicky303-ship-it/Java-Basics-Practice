package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Map2 {
    public static void main(String args[]){
        System.out.println("Welcome to map Interface:\n");
        Map<Integer,String> map= new HashMap<>();
        map.put(101,"aditya");
        map.put(102,"Rahul");
        map.put(103,"Aman");
        map.put(104,"Shivam");
        map.put(105,"Rohit");
        System.out.println("complete Map:");
        System.out.println(map);

        System.out.println("value usin Key");
        System.out.println(map.get(103));

        System.out.println("cheking existes key");
        System.out.println(map.containsKey(106));

        System.out.println("cheking exist value:");
        System.out.println(map.containsValue("Rahul"));

        System.out.println(" removing key:104");
        System.out.println(map.remove(104));

        System.out.println("after removing Map Interface:");
        System.out.println(map);

        System.out.println("size of map interfaces:");
        System.out.println(map.size());

    }
}
//Q1.V
//Q2.V
//Q3.V
//Q4.boolean
//Q5.duplicates keys are not allowed in map because java can get confuse that suppose that 101,101 two student's rollno. so it will same so key cannot duplicates
