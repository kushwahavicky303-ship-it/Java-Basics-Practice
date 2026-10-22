package functions;

public class functionoverloading {
    public static void main(String[] agrs){
        System.out.println("welcome to overloading:");
        int x =  sum(4,5);
        System.out.println(x);

        int y = sum(5,5,6);
        System.out.println(y);

        int z = sum(5,4);
        System.out.println(z);

        greet("aditya",18);

    }
    static int sum(int a, int b){
        return (a+b);
    }
    static int sum(int a, int b,int c){

        return (a+b+c);
    }
    static int sum(double a,double b){

        return (int)(a+b);//type casting=double-->int
    }
    static void greet(String name , int a){
        System.out.println("hi" +name+ "you are aged" +a );
    }
}
