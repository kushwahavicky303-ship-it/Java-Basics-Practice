package encapsulation;

public class EncapsulationQ1 {
    public static void main(String args[]){
        Mobile m1 = new Mobile();
        m1.setBrand("Samsung");
        m1.setBattery(85);
        m1.setPrice(25000);
        System.out.println("brand is: " +m1.getBrand());
        System.out.println(" battery is" +m1.getBattery());
        System.out.println("Price is: " +m1.getPrice());
        m1.Call();
    }
}
class Mobile{
    private String brand;
    private double price;
    private int battery;
    void setBrand(String brand){
        this.brand = brand;
    }
    String getBrand(){
        return brand;
    }
    void setPrice(double price){
        if(price>0){
            this.price = price;
        }
        else{
            System.out.println("Invalid price:");
        }
    }
    double getPrice(){
        return price;
    }
    void setBattery(int battery){
        if(battery>=0 && battery<=100){
            this.battery = battery;
        }
        else{
            System.out.println("Invalid battery");
        }
    }
    int getBattery(){
        return battery;
    }
    void Call(){
        System.out.println("Mobile is ringing: ");
    }

}