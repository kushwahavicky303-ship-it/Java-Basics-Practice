package flowofcontrrols;

public class nestedifdemo {
    public static void main(String[] args){

        System.out.println("welcome to nested if statements");

        int num = 15;

        if(num > 10){

            System.out.println("First condition passed: num > 10");

            if(num < 20){

                System.out.println("Second condition passed: num < 20");

                if(num == 15){
                    System.out.println("Third condition passed: num == 15");
                }
            }
        }
    }
}
