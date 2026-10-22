package ClassandObject;

public class Class2 {
    public static void main(String args[]){
        System.out.println("welcome to the oops class:");
        Car c1 = new Car();
        Car c2 = new Car();

        c1.brand ="Toyota";
        c1.speed = 99;
        System.out.println("Brand is: " +c1.brand);
        System.out.println("speed is: " +c1.speed);
        c1.drive();

        c2.brand = "TATA";
        c2.speed = 120;
        System.out.println("Brand is: " +c2.brand);
        System.out.println("speed is: " +c2.speed);
        c2.drive();


    }
}
class Car{
    String brand;
    int speed;
    void drive(){
        System.out.println("car is driving:");
    }
}