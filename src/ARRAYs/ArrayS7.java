package ARRAYs;

public class ArrayS7 {
    public static void main(String args[]){
        System.out.println("Welcome to the arrays:");
        int[] arr = {10, 20, 30, 40, 50, 60};
        int temp1 = arr[0];
        arr[0] = arr[5];
        arr[5] = temp1;
        //Swapping 2
        int temp2 = arr[1];
        arr[1] = arr[4];
        arr[4] = temp2;
        //swapping 3
        int temp3 = arr[2];
        arr[2] = arr[3];
        arr[3] = temp3;
        System.out.println("After swapping all elements: ");
        System.out.println("first element: " +arr[0]);
        System.out.println("Second element: " +arr[1]);
        System.out.println("third element: " +arr[2]);
        System.out.println("forth element: " +arr[3]);
        System.out.println("fifth element: " +arr[4]);
        System.out.println("sixth element: " +arr[5]);
        System.out.println("array of array:" +arr.length);

    }
}
