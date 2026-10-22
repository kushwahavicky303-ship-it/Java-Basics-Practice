package Immutableclasses;

public class demo2 {
    public static void main(String args[]){
        System.out.println("welcome to object classes");
        Student1 s1 = new Student1();
        s1.name = "aditya";
        s1.age = 21;
       System.out.println(s1.toString());
    }
}
class Student1 {
    String name;
    int age;
}