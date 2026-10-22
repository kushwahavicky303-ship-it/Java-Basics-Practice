package flowofcontrrols;

import java.util.Scanner;

public class evenorodd {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.println("to cheking the even number:");
       System.out.println("please enter yours numbers:");
       int num = input.nextInt();
       if(num % 2 == 0){
           System.out.println("your number is even:");
       }
       else{
           System.out.println("your number is odd:");
       }
   }
}
