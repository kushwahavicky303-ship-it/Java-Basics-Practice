package Generics;

public class Demo1 {
    public static void main(String args[]){
        System.out.println("welcome to generics");
        Pair<String , Integer> p1 = new Pair<>("aditya",9);
        System.out.println(p1.first);
        System.out.println(p1.second);
        Pair<Integer ,Boolean> p2 = new Pair<>(4,true);
        System.out.println(p2.first);
        System.out.println(p2.second);
    }
}
class Pair<T,U>{//type parameter
    T first;
    U second;
    Pair(T first, U second){
        this.first = first;
        this.second = second;

    }
}
