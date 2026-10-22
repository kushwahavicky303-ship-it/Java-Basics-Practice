package ARRAYs;

public class ArrayS14 {
    public static void main(String args[]){
        System.out.println("welcome to the max and min:");
        int arr[] = {12, 5, 28, 7, 19, 3, 25};
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("max: " +max);
        System.out.println("min: " +min);
    }
}
