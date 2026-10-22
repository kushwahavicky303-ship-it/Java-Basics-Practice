package flowofcontrrols;

import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcomee to positive and negative numbers");
        System.out.println("please enter your numbers:");
        int num = input.nextInt();
        if(num > 0){
            System.out.println("your number is positive :");

        }
        else{
            System.out.println("your number is negative:");
        }
    }
}
