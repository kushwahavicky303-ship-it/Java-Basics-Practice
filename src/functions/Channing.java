package functions;

public class Channing {
    public static void main(String args[]){
        System.out.println("welcome to the method overriding: ");
        fun1();
        System.out.println("hiii");
    }
    static void fun1(){
        fun2();
        System.out.println("hello");
    }
    static void fun2(){
        fun3();
        System.out.println("namaste");
    }
    static void fun3(){
        System.out.println("good bye");
    }
}
