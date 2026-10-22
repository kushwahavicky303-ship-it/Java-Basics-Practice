package Abstraction1;

public class Abstraction1 {
    public static void main(String args[]){
        System.out.println("welcome to the abstract classes:");
        Payment p1 = new UPIPayment();
        p1.pay(2500);
        p1.receipt();
    }
}
abstract class Payment{
    abstract void pay(double amount);
    void receipt(){
        System.out.println("Payment successful");
    }
}
class UPIPayment extends Payment{
    void pay(double amount){
        System.out.println("Payment amount");
    }
}