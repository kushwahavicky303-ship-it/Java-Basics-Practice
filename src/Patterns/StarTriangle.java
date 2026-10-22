package Patterns;

import java.util.Scanner;

public class StarTriangle {
    public static void main(String args[]){
        System.out.println("welcome to the Star Triangle: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number of rows and columns");
      int n = sc.nextInt();
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
