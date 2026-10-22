package Enums;

public class Demo4 {
    public static void main(String args[]){
        System.out.println("welcome to nume() method:");
        //this method returns only one enum constant.
        Animal animals = Animal.DOG;
        System.out.println(animals.name());
    }
}
enum Animal{
    DOG,
    COW,
    ELEPHANT,
    GOAT,
    LION
}
