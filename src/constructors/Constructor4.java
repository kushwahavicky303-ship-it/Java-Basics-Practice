package constructors;

public class Constructor4 {
    public static void main(String args[]){
        System.out.println("welcome to the oops constructor: ");
        Laptop l1 = new Laptop();
        System.out.println("brand is: " +l1.brand);
        System.out.println("price is: " +l1.price);
        Laptop l2 = new Laptop();
        System.out.println("brand is: " +l2.brand);
        System.out.println("price is: " +l2.price);


    }
}
class Laptop{
    String brand;
    int price;
    Laptop(){
        brand ="Acer";
        price = 55000;

    }
}