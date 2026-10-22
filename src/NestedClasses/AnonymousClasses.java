package NestedClasses;

public class AnonymousClasses {
    public static void main(String args[]){
        System.out.println("welcome to anonymous calsses:");
    }
}
class Person{
    void introduce(){
        System.out.println("hi ,i am aditya:");
    }
}
class Guest extends Person{
    void introduce(){
        System.out.println("hyy, i am guest:");
    }
}
