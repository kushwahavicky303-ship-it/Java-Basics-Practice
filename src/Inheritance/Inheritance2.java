package Inheritance;

public class Inheritance2 {
    public static void main(String args[]){
        System.out.println("welcome to the inheritance");
      Puppy p1 = new Puppy();
      p1.eats();
      p1.bark();
      p1.play();
    }
}
class Animal{
    void eats(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog barks");
    }
}
class Puppy extends Dog{
    void play(){
        System.out.println("puppy plays");
    }
}