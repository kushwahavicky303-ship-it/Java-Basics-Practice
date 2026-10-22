package ARRAYs;

public class ArrayS9 {
    public static void main(String args[]){
        System.out.println("welcome to the arrays practice:");
        int[] arr = {10,20,30,40,50,60};
        //first->last
        int temp1 = arr[0];
        arr[0] = arr[5];
        arr[5] = temp1;
        //second ->second last
        int temp2 = arr[1];
        arr[1] = arr[4];
        arr[4] = temp2;
        //third->thihrd last
        int temp3 = arr[2];
        arr[2] = arr[3];
        arr[3] = temp3;
        System.out.println("First element: " +arr[0]);
        System.out.println("second element: " +arr[1]);
        System.out.println("third element: " +arr[2]);
        System.out.println("fourth element: " +arr[3]);
        System.out.println("fifth element: " +arr[4]);
        System.out.println("sixth element: " +arr[5]);
        System.out.println("Array length: " +arr.length);
        System.out.println("Sum of all elements: " +(arr[0]+arr[1]+arr[2]+arr[3]+arr[4]+arr[5]));





    }
}
//Q1.int[] arr = new int[5] we can store only five elements in this method because it is fised size and
//int[] arr { unfisexed elements} we can store many elements without any error
//Q3.default value of an int array is 0
//Q3.ArrayIndexoutofBoundException



