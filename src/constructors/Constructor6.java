package constructors;

public class Constructor6 {
    public static void main(String args[]){
        System.out.println("welcome to the constructor and this keyword: ");
        Book b1 = new Book("Java Programming",500);
        Book b2 = new Book("DSA",400);
        System.out.println("First object's value: ");
        System.out.println("Title is: " +b1.title);
        System.out.println("price is: " +b1.price);

        System.out.println("Second object's value: ");
        System.out.println("Title is: " +b2.title);
        System.out.println("price is: " +b2.price);

    }
}
class Book{
    String title;
    int price;
    Book(String title,int price){
        this.title = title;
        this.price =price;
    }
}