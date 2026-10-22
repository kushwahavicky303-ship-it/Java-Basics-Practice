package Abstraction;

import org.w3c.dom.ls.LSOutput;

public class statickeywords {
    public static void main(String[] args){
        System.out.println("Welcome to static private keywords");
        A a = new B();
        a.fun();
    }
}
class A{
    static void fun(){//static belongs to class not to objects
        System.out.println("Hello:");
    }
    private void fun2(){//private method cannat be overriden:
        System.out.println("hello");
    }
    final void fun3(){
        System.out.println("good morning:");
    }
}
class B extends A{
    static void fun(){
        System.out.println("bye:");
    }
}

