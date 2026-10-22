package functions;

public class functionschaining {
    public static void main(String[] args){
        fun1();
        System.out.println("by");
    }
    static void fun1(){
        fun2();
        System.out.println("hiii");
    }
    static void fun2(){
        fun3();
        System.out.println("hello");
    }
    static void fun3(){
        System.out.println("how are you bro:");
    }
}
