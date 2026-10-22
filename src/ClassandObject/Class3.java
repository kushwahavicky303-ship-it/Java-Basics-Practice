package ClassandObject;

public class Class3 {
    public static void main(String args[]){
        System.out.println("welcome to the oops class:");
        //1st object creation
        Mobile m1 = new Mobile();
        m1.brand = "Suamsung";
        m1.price = 2300000;
        System.out.println("Brand is: " +m1.brand);
        System.out.println("price is: " +m1.price);
        m1.call();
        // 2nd object Creation
        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.price = 200000;
        System.out.println("brand is: " +m2.brand);
        System.out.println("price is: " +m2.price);
        m2.call();


    }
}
class Mobile{
    String brand ;
    int price;
    void call(){
        System.out.println("Calling...");

    }
}
