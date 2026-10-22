package Exception;

public class Exception1 {
    public static void main(String args[]){
        System.out.println("welcome to the exception handling:");
        System.out.println("hiii");

        try{
            int a = 10;
            int b = 0;
            System.out.println(a/b);
            System.out.println("hello");//it will not execute because the normal flow of the program has been interrupted
            System.out.println("exception handling:");
        } catch (ArithmeticException e) {
            System.out.println("arithmeticException:");
        }
    }
}
