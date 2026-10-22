package polymorphism;

public class runtimepolymorphism {
    public static void main(String[] args) {
        System.out.println("welcome to polymorphism:");
        Animal a1 = new Dog();
        a1.sound();
        Animal a2 = new Cat();
        a2.sound();
        Animal a3 = new Goat();
        a3.sound();

    }
}
interface Animal{
     void sound();
}
class Dog implements Animal{
   public void sound(){
        System.out.println("Dog is barking");
    }
}
class Cat implements Animal{
    public void sound(){
        System.out.println("Cat is meowing:");
    }
}
class Goat implements Animal{
   public void sound(){
        System.out.println("the Goat is mehmeh");
    }
}
