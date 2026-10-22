package ARRAYs;

public class ArrayS2 {
    public static void main(String args[]){
        System.out.println("welcome to the arrays:");
        int[] arr = {12,25,8,40,15};
        System.out.println("First element: " +arr[0]);
        System.out.println("Second element: " +arr[1]);
        System.out.println("Last element: " +arr[4]);
        System.out.println("Sum of first and Last element is: "+ (arr[0] +arr[4]));
        System.out.println("Diffrence between 40 and 8: " +(arr[3]-arr[2]));
        System.out.println("Product of second and last elements: " +(arr[1]*arr[4]));
        System.out.println("Length of array is: " +arr.length);
        //Updated elements:
        arr[0] = 100;
        arr[2] = 50;
        System.out.println("Updated First elements: " +arr[0]);
        System.out.println("Updated last elements: " +arr[2]);

    }
}
