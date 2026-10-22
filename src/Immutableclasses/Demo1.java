package Immutableclasses;

public class Demo1 {
    public static void main(String args[]){
        System.out.println("welcome to immutable classes:");
        //object
        Student s1 = new Student(18 , "aditya","itt kanpur");
        System.out.println(s1.getAge());
        System.out.println(s1.getName());
        System.out.println(s1.getCollege());
        //s1.getAge("shivam");it cannot be change
    }
}
//immutable class
final class Student{
    private final String name;
    private final int age;
    private final String college;
   //constructor
   Student(int age , String name,String college){
       this.age = age;
       this.name = name;
       this.college = college;
   }
   //getter method
    public int getAge(){
       return this.age;
    }
    public String getName(){
       return this.name;
    }
    public String getCollege(){
       return this.college;
    }

}
