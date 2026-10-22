package flowofcontrrols;

import java.util.Scanner;

public class passingandfailing {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to passed and fail:");
        System.out.println("please enter student's marks");
        int marks= input.nextInt();
        if(marks>=33){
            System.out.println("you are passed:");
        }
        else{
            System.out.println("sorry:you are failed:");
        }
    }
}
