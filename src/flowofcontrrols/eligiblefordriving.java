package flowofcontrrols;

import java.util.Scanner;

public class eligiblefordriving {
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to driving licence:");
        System.out.println("please enter the age:");
        int age = input.nextInt();
        if(age >=18){
            System.out.println("you are eligible for licence:");
        }
        else{
            System.out.println("you are not eligible");
        }
    }
}
