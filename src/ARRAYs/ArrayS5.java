package ARRAYs;

public class ArrayS5 {
    public static void main(String args[]){
        System.out.println("welcome to the array: ");
        int[] arr = {8, 16, 24, 32, 40, 48, 56, 64};
        System.out.println("Second element: "+arr[1]);
        System.out.println("Second-Last element: " +arr[6]);
        System.out.println("Sum of Even Indexes: " +(arr[0]+arr[2]+arr[4]+arr[6]));
        System.out.println("Sum of Odd Indexes: " +(arr[1]+arr[3]+arr[5]+arr[7]));
        int temp = arr[0];
        arr[0] = arr[7];
        arr[7] = temp;
        System.out.println("After swapping First element: " +arr[0]);
        System.out.println("After swapping Last element: " +arr[7]);
        System.out.println("Length of the array: " +arr.length);

    }
}
