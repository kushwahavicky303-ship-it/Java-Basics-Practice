package ARRAYs;

public class ArrayS11 {
    public static void main(String args[]){
        System.out.println("welcome to the array sum using loop:");
        int[] arr = {5, 10, 15, 20, 25, 30};
        for(int i=0; i<arr.length; i++){
            System.out.println("Array's Elements: " +arr[i]);

        }
        int sum = 0;
        for(int i=0; i<arr.length; i++){
           sum = sum+arr[i];
        }
        System.out.println("Sum of arrays:" +sum);
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product = product*arr[i];
        }
        System.out.println("Product of all elements:" +product);

    }
}
