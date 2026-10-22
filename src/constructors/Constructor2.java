package constructors;


public class Constructor2 {
    public static void main(String args[]){
        System.out.println("welcome to the oops constructor:");
        Car c1 = new Car("toyota",1500000);
        Car c2 = new Car("TATA",12000000);
    }

}
class Car{
    String brand;
    int price;
    Car(String n,int a){
        System.out.println("Brand is: " +n);
        System.out.println("price is: " +a);
        brand = n;
        price = a;
    }
}
