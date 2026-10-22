package NestedClasses;

public class Innerclass {
    public static void main(String[] args){
        System.out.println("welcome to inner classes:");
        Outer2 outer = new Outer2();
        Outer2.Inner inner = outer.new Inner();
        inner.fun();
    }
}
class Outer2{
    int x = 10;
    class Inner{
       int x= 20;
        void fun(){
            System.out.println(x);//java first print it because they look inner class first
            System.out.println(Outer2.this.x);
        }
    }
}
