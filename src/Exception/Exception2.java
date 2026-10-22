package Exception;

public class Exception2 {
    public static void main(String args[]){
        System.out.println("welcome to the throw:");
        try{
            int balance = 1000;
            int withdraw= 1500;
            if (balance<withdraw){
                throw new IllegalArgumentException("Invalid amount:");
                //it will print because throw throws the exception it eill not print directly


            }
        }
        catch (IllegalArgumentException e ){
            System.out.println("Insufficient balance:");

        }
        System.out.println("Transaction succesful:");


    }
}
