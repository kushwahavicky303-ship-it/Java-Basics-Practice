package constructors;

public class Constructor3 {
    public static void main(String args[]){
        System.out.println("welcome to the constructor oops: ");
        Product p1 = new Product();
        Product p2 = new Product("Milton Bottle");
        Product p3 = new Product("Bislary Bottle",240);
        System.out.println("name of p1 is: " +p1.name);
        System.out.println("price of p1 is: " +p1.price);
        System.out.println("Product name is: " +p2.name);
        System.out.println("product name is: " +p3.name);
        System.out.println("product's price is: " +p3.price);
    }
}
class Product{
    String name;
    int price;
    Product(){
        name = "Unknown";
        price= 0;
    }
    Product(String n){
        name =n;
    }
    Product(String n,int p){
        name = n;
        price = p;
    }
}