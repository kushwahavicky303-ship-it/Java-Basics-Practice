package NestedClasses;

import javax.xml.namespace.QName;

public class Animalclass {
    public static void main(String args[]){
        System.out.println("welcome to static nested classes:");
        Animal.Dog d1 = new Animal.Dog();
        d1.sound();
    }
}
class Animal{
   static  String name = "black";
    String color;
    //nested class
    static class Dog{
        void sound(){
            System.out.println("name" +name);
            System.out.println("Odg is barking:");
        }
    }
}
