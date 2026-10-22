package NestedClasses;

public class LocalClass {
    public static void main(String args[]){
        System.out.println("welcome to locs; classes:");
        Outer3 outer3 = new Outer3();
        outer3.greet();
    }
}
class Outer3{
    void greet(){
        class Local{
            void SayHello(){
                System.out.println("hello");
            }
        }
        //The object must be created inside the same method where the local class is declared.
        Local local = new Local();
        local.SayHello();
    }
}
