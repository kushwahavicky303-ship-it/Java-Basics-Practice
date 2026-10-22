package TWODArrays;

public class PracticeArrays {
    public static void main(String args[]){
        System.out.println("welcome to the arrays:");
        int[] arr = {1,5,3};
        int max =0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("sum: " +max);


    }
}
