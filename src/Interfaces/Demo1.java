package Interfaces;

public class Demo1 {
    static void main(String[] args){
        System.out.println("welcome to interfaces:");
        //cannot be create an object of an interfaces directly
       // Animal a1 = new Animal();
       // a1.sound();
        Dog d1 = new Dog();
        d1.sound();
    }
}
interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog is barking:");
    }
}
