package Scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Scanner input output:");
        System.out.println("please enter something:");

        //it will print full name
        String name = sc.nextLine();
        System.out.println("the name is:" +name);

        //this method will print a single word and line break
        String Name = sc.next();
        System.out.println("the name is:" +Name);

    }
}
//scanner class is slow than buffered reader.