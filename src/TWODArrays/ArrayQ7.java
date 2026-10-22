package TWODArrays;

public class ArrayQ7{
    public static void main(String args[]){
        System.out.println("welcome the arrays minimum elements:");
        int[][] arr = {  {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45}};
        int min = arr[0][0];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                }
            }
        }
        System.out.println("minimum elements are: " +min);
    }
}
