package ARRAYs;

public class ArrayP1 {
    public static void main(String args[]){
        System.out.println("Welocme to the array practice:");
        int[] arr = {10,20,30,40,50};
        int sum = 0;
        for(int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
            sum = sum+arr[i];
        }
        System.out.println("sum=" +sum);
    }
}
