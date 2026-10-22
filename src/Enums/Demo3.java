package Enums;

public class Demo3{
    public static void main(String args[]){
        System.out.println("welcome to enum value() method:");
        //value() method returns all constant
        Student[] students = Student.values();
        for(Student s :students){
            System.out.println(s);
        }
    }
}
enum Student{
    JOHN,
    ELSA,
    JOHNI,
    ELIYA
}
