package loops;

public class nestedlooppattern {
    public static void main(String[] args){
        System.out.println("welcome to pattern printing:");
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
