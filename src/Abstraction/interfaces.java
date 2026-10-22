package Abstraction;

public class interfaces {
    public static void main(String[] args){
        System.out.println("welcome to interfaces:");
        Animal a1 = new Dog();//Animal a1 = new Animal();--> we can creat objects of car
        System.out.println("the dog having these things:");
         a1.eat();
         a1.sleep();
         a1.sound();
         //second objects ,created for calling the cats methods
        System.out.println("the cat is having these things");
        Animal a2 = new Cat();
        a2.eat();
        a2.sleep();
        a2.sound();

    }
}
interface Animal{//interface have all nethods public by default:
    //it can not consistes define method{}
   void sleep();
   void sound();
   void eat();
}
class Dog implements Animal{
    public void sleep(){
        System.out.println("Dog sleeping:");
    }
    public void sound(){
        System.out.println("Dog barks:");
    }
    public void eat(){
        System.out.println("dogs eats chiken");
    }
}
class Cat implements Animal{
    public void sleep(){
        System.out.println("cat is ssleeping:");
    }
    public void sound(){
        System.out.println("cat is meaowing:");
    }
    public void eat(){
        System.out.println("Cat is drinking milk");
    }
}

