package functions;

public class samemethod {
    public static void main(String[] args){
        System.out.println("welcome to same method :");
        fun();
       int x= fun2();
        System.out.println(x);

    }
    static void fun(){
        System.out.println("hello");
    }
    static int fun2(){//can not decide on return type...we have to change method name..
        System.out.println("hello");
        return 5;
    }
}
