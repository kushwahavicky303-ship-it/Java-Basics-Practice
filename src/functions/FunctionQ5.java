package functions;

public class FunctionQ5 {
    public static void main(String args[]){
        System.out.println("welcome to the functions practice:");
        int[] arr = {10, 7, 4, 9, 12, 5};
        int result =countEven(arr);
        System.out.println(result);
    }
    static int countEven(int[] arr){
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        return count;
    }
}
