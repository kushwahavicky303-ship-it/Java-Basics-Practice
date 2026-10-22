package ARRAYs;

public class usingloop {
    public static void main(String[] args){
        System.out.println("welcome to array using loop");
        int[] rollNum = new int[10];
        int x = 101;
        for(int i=0; i< rollNum.length;i++){
            rollNum[i] =x;
            x++;
        }
        for(int i=0; i< rollNum.length;i++){
            System.out.println(rollNum[i]);
        }
    }
}
