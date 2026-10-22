package ARRAYs;

import java.util.Scanner;

public class usingloopscanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to arrays using loop");
        System.out.println("Please enter 5 array elements:");

        int[] arr = new int[5];

        // Taking input
        for(int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        // Printing array
        System.out.println("Array Elements are:");

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}