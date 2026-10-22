package functions;

public class FunctionOverloading2 {
    public static void main(String args[]){
        System.out.println("welcome to the function overloading:");
        int result1 = multiple(5,4);
        int result2 = multiple(2,3,4);
        System.out.println(result1);
        System.out.println(result2);
    }
    static int multiple(int a, int b){
        int result1 = a*b;
        return result1;
    }
    static int multiple(int a,int b,int c){
        int result2 = a*b*c;
        return result2;
    }
}
