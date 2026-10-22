package ARRAYs;

public class ArrayS3 {
    public static void main(String args[]){
        System.out.println("welcome to the arrays questions :");
        int[] arr = {5, 10, 15, 20, 25, 30};
        System.out.println("First element is: " +arr[0]);
        System.out.println("Last element is: " +arr[5]);
        System.out.println("Middle first element: " +arr[2]);
        System.out.println("Middle second element: " +arr[3]);
        System.out.println("Sum of first and last: " +(arr[0]+arr[5]));
        System.out.println("sum of Middle two: " +(arr[2] +arr[3]));
        arr[0] = 100;
        arr[5]= 300;
        System.out.println("Updated Index 0 is: " +arr[0]);
        System.out.println("Updated Index 5 is: " +arr[5]);
        System.out.println("The length if array is: " +arr.length);
    }
}
