package functions;

public class FunctionQ3 {
    public static void main(String args[]){
        System.out.println("welcome to the functions practices: ");
        int x= 7;
        int result = square(x);
        System.out.println(result);

    }
    static int square(int n){
        int result = n*n;
        return result;
    }
}
