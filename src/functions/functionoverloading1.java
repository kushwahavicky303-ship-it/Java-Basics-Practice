package functions;

public class functionoverloading1 {
    public static void main(String[] args){
        System.out.println("welcome to addition of numbers:");
        int x = sum(4,2);
        System.out.println(x);
        int y = sum(6,7);
        System.out.println(y);
        int z = sum(5,4);
        System.out.println(z);

        int a = sum(20,10,30);
        System.out.println(a);
        int b = sum(2,4,6);
        System.out.println(b);
        int p = sum(5,6);
        System.out.println(p);

        greet("aditya",18);


    }
    static int sum(int a, int b){//diffrent numbers of parameters...
        return(a+b);
    }
    static int sum(int a,int b,int c){//we can use same method (sum)
        return(a+b+c);

    }
    static int sum(double a, double b){//diffrent types of parameters
        return (int) (a+b);   //type casting-->when you use same data types like above
    }
    static void greet(String name, int age){
        System.out.println("Hi " +name+ " your age is " +age);
    }
}
