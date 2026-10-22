package flowofcontrrols;

import java.util.Scanner;

public class greaternumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welocme to larger numbers:");
        System.out.println("please enter your first number:");
        int firstNum = input.nextInt();
        System.out.println("please enter your second number:");
        int secondNum = input.nextInt();

        if(firstNum > secondNum){
            System.out.println("first number is larger:");
        }
        else{
            System.out.println("second number is larger");
        }
    }
}
