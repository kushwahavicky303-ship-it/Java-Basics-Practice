package functions;

public class FunctionQ2 {
    public static void main(String args[]){
        System.out.println("welcome to the functions practices: ");
        int x =5;
        int y =10;
        int result = test(x,y);
        System.out.println(result);
        System.out.println(x);
        System.out.println(y);

    }
    static int test(int a,int b){
        a = a*2;
        int result = a+b;
        b = result+5;
        return b;
    }
}
