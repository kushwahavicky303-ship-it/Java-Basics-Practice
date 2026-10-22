package ARRAYs;

public class ArrayP5 {
    public static void main(String args[]){
        System.out.println("welcome to the max:");
        int[] arr = {10,25,8,40,15};
        int min = arr[0];
        for(int i= 0; i<arr.length;i++){
            if(arr[i]<min){//for minimum elements:and //>for maximum elements:
                min= arr[i];
            }
        }
        System.out.println(+min);

    }
}
