package ARRAYs;

public class ArrayS16 {
    public static void main(String args[]){
        System.out.println("welcome tot he arrays:");
        int arr[] = {4, 7, 2, 9, 6, 3, 8};
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>5){
                count++;
            }
        }
        System.out.println("count: " +count);
    }
}
