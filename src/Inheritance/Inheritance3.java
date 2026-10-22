package Inheritance;

public class Inheritance3 {
    public static void main(String args[]){
        System.out.println("welcome to the inheritane practice:");
        Developer d1 = new Developer();
        d1.name = "Aditya";
        d1.salary = 60000;
        d1.language = "Java";
        d1.displayDeveloper();
        d1.display();
    }
}
class Employee{
    String name;
    int salary;
    void display(){
        System.out.println(name);
        System.out.println(salary);
    }
}
class Developer extends Employee{
    String language;
    void displayDeveloper(){
        System.out.println(language);
    }
}