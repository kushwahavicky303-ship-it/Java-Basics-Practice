package functions;

public class FunctionQ4 {
    public static void main(String args[]){
        System.out.println("welcome to the functions practice: ");
        int x=25;
        int y=40;
        int result = findMax(x,y);
        System.out.println(result);
    }
    static int findMax(int a , int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }

    }
}
