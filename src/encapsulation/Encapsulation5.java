package encapsulation;

public class Encapsulation5 {
    public static void main(String args[]){
        System.out.println("welcome to the Encapsulation:");
        Car c1 = new Car();
        c1.setBrand("toyota");
        c1.setSpeed(120);
        System.out.println("brand is: " +c1.getBrand());
        System.out.println("speed is: " +c1.getSpeed());

    }
}
class Car{
    private String brand;
    private int speed;
    //first getter setter
    void setBrand(String brand){
        this.brand = brand;
    }
    String getBrand(){
        return brand;
    }
    void setSpeed(int speed){
        this.speed = speed;
    }
    int getSpeed(){
        return speed;
    }

}