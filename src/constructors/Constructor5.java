package constructors;

public class Constructor5 {
    public static void main(String args[]){
        System.out.println("welcome to the constructor oops: ");
        //1st object
        Mobile m1 = new Mobile("Samsung",18000);
        System.out.println("First objects value:");
        System.out.println("Brand is: " +m1.brand);
        System.out.println("price is: " +m1.price);

        //2nd object
        Mobile m2 = new Mobile("Realme", 15000);
        System.out.println("Second objects value:");
        System.out.println("Brand is: " +m2.brand);
        System.out.println("price is: " +m2.price);

        //3rd object
        Mobile m3 = new Mobile("OnePlus",30000);
        System.out.println("Third objects value:");
        System.out.println("Brand is: " +m3.brand);
        System.out.println("price is: " +m3.price);
//        m1.display();




    }
}
class Mobile{
    String brand;
    int price;
    Mobile(String n,int a){
        brand = n;
        price = a;
    }
//    void display(){
//        System.out.println("some is displaying: " +brand);
//    }
}
