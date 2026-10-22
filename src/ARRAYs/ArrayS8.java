package ARRAYs;

public class ArrayS8 {
    public static void main(String args[]){
        System.out.println("welcome to the array:");
        int[] arr = {12, 5, 18, 7, 25, 10};
        int max = arr[0];
        if(arr[1]>max){
            max = arr[1];
        }
        if(arr[2]>max){
            max = arr[1];
        }
        if(arr[3]>max){
            max = arr[1];
        }
        if(arr[4]>max){
            max = arr[1];
        }
        if(arr[5]>max){
            max = arr[1];
        }
        //Min statements:
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
            min = arr[5];
        }
        System.out.println("Maximum elements: " +max);
        System.out.println("Minimum elements: " +min);
        int temp = arr[4];
        arr[4] = arr[1];
        arr[1] = temp;
        System.out.println("First updated value is: " +arr[4]);
        System.out.println("second updated value is: " +arr[1]);


    }
}
//Q1.an array is like a containter that stores elements of the same data types in a single variables
//Q2.Array indexing start from 0 because it allocate contiguos memory
//Q3.arr.length is used to find the length of an array and arr.length() is a method