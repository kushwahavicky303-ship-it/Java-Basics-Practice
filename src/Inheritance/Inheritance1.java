package Inheritance;

public class Inheritance1 {
    public static void main(String args[]){
        System.out.println("welcome to the inheritance practice session:");
        Car c1 = new Car();
        c1.Starts();
        c1.Drive();
    }
}
//parent class
class Vehicle{
    void Starts(){
        System.out.println("Vehicles starts");
    }
}
class Car extends Vehicle{
    void Drive(){
        System.out.println("car is driving");
    }
}
