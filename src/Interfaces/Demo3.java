package Interfaces;

public class Demo3 {
    public static void main(String args[]){
        System.out.println("Welcome to Interface Variables");


        Scorpio  s1 = new Scorpio();
        s1.drive();

    }
}
interface Vehicle {

    int SPEED = 120;
    int WHEELS = 4;

    void drive();
}
class Scorpio implements Vehicle {

    @Override
    public void drive() {
        System.out.println("Black Scorpio is Driving...");
    }

    void showDetails() {

        System.out.println("Speed : " + SPEED);
        System.out.println("Wheels : " + WHEELS);

        drive();
    }
}