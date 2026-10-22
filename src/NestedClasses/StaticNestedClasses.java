package NestedClasses;

import org.w3c.dom.ls.LSOutput;

public class StaticNestedClasses {
    public static void main(String args[]){
        System.out.println("welcome to nested classes:");
        Outer.Inner oi = new Outer.Inner();
        oi.fun();
    }
}
class Outer{//it can access static variables
    static int x = 4;
    //int y;
    static class Inner{

        void fun(){
            System.out.println(x);
           // System.out.println(y);
        }
    }
}