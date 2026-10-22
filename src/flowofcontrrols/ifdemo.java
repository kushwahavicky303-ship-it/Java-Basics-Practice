package flowofcontrrols;

public class ifdemo {
    public static void main(String[] args){
        System.out.println("welcome to IFdemo:");
        int age = 18;
        if(age>=18){
            System.out.println("you can vote ");
        }
        int password = 12345;
        if(password == 12345){
            System.out.println("your password is this");
        }
        int num = 15;
        if(num > 0){
            System.out.println("number is positive");
        }
        if(num %2 == 0){
            System.out.println("even number");
        }
        if(num>10){
            System.out.println("greater than 10");
        }

    }
}
