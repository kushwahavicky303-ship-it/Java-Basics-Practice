package Abstraction;

public class abstractclass {
    public static void main(String[] args){
        System.out.println("welcome to abstraction :");
        //objects cannot be created for Car class...because uses abstract..
        Car car = new ElectricCar();
        //variables
        car.brand = "fortuner";
        car.color = "black";
        car.price = 45000000;
        //car. calls the methods:
        car.accelerate();
        car.brake();
        car.Start();
    }
}
 abstract class Car{//concrete class//class will also abstract when you make methods abstract.
    String brand;
    int price;
    String color;
    void Start(){
        System.out.println("car started:");
    }
   abstract void accelerate();
   abstract void brake();

}
class FuelCar extends Car{
    void accelerate(){
        System.out.println("fuel car is accelerating:");
    }
    void brake(){
        System.out.println("fuel car is braking:");
    }
}
class ElectricCar extends Car{
    void accelerate(){
        System.out.println("electric car is accelerating:");
    }
    void brake(){
        System.out.println("electric car is stopping:");
    }
}