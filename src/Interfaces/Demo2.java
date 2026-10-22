package Interfaces;

public class Demo2 {
    public static void main(String args[]){
        System.out.println("welcome to interfaces using polymorphism:");
        Payment p1 = new DebitCard();
        p1.pay();
        Payment p2 = new CreditCard();
        p2.pay();
    }
}
//polymorphism dynamic rules
interface Payment{
    void pay();
}
class CreditCard implements Payment{
    @Override
     public void pay(){
        System.out.println("paying via Creditcard:");
    }
}
class DebitCard implements Payment{
    @Override
    public void pay(){
        System.out.println("paying via Debitcard:");
    }
}
