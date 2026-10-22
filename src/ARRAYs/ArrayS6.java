package ARRAYs;

public class ArrayS6 {
    public static void main(String args[]){
        System.out.println("welcome to the arrays:");
        int[] arr = {12, 5, 18, 7, 25, 10};
        int max = arr[0];
        if(arr[1]>max){
            max = arr[1];
        }
        if(arr[2]>max){
            max = arr[2];
        }
        if(arr[3]>max){
            max = arr[3];
        }
        if(arr[4]>max){
            max = arr[4];
        }
        if(arr[5]>max){
            max = arr[5];
        }
        int min = arr[0];
        if(arr[1]<min){
            min = arr[1];
        }
        if(arr[2]<min){
            min = arr[2];
        }
        if(arr[3]<min){
            min = arr[3];
        }
        if(arr[4]<min){
            min = arr[4];
        }
        if(arr[5]<min){
            min= arr[5];
        }
        System.out.println("Maximum: " +max);
        System.out.println("Minimum: " +min);
    }
}
