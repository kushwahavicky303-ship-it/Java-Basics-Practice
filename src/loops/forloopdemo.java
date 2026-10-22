package loops;

public class forloopdemo {
    public static void main(String[] args){
        System.out.println("welcome to for loop:");
        for(int i=1; i<=10; i++){
            System.out.println(i);
        }
        // comma seperated varibales
        for(int i=1,j=1; i<=10 && j<=5; i++,j+=2){
            System.out.println(i*j);
        }

    }
}
