package TWODArrays;

public class ArrayQ4 {public static void main(String args[]){
    System.out.println("2D arrays:");
    int[][] arr = {
            {5, 10, 15},
            {20, 25, 30},
            {35, 40, 45}
    };
    int count =0;
    for(int i=0; i<arr.length; i++){
        for(int j=0; j<arr[i].length; j++){
            if(arr[i][j]>20){
                count++;
            }
        }
    }
    System.out.println("count: " +count);
}
}
