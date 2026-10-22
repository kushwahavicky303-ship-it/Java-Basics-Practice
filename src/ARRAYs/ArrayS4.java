package ARRAYs;

public class ArrayS4 {
    public static void main(String args[]) {
        System.out.println("welcome to the arrays practice:");
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        System.out.println("First element is: " + arr[0]);
        System.out.println("last element is: " + arr[6]);
        System.out.println("Middle element is: " + arr[3]);
        System.out.println("Sum of First three elements: " + (arr[0] + arr[1] + arr[2]));
        System.out.println("Sum of last three elements: " + (arr[4] + arr[5] + arr[6]));
        arr[1] = 200;
        arr[3] = 400;
        arr[5] = 600;
        System.out.println("Updated values are :");
        System.out.println(arr[1]);
        System.out.println(arr[3]);
        System.out.println(arr[5]);
        System.out.println("total Length of array: " +arr.length);

    }
}