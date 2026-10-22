package TWODArrays;

public class ArrayQ8 {
    public static void main(String args[]){
        System.out.println("welcome to the sum of row :");
        int[][] arr = {
                {5,10,15},
                {20,25,30},
                {35,40,45}
        };
        for(int j=0; j<arr[0].length; j++){
            int sum =0;
            for(int i=0; i<arr.length; i++){
                sum = sum+arr[i][j];
            }
            System.out.println("colums: " +(j+1)+ "sum: " +sum);
        }
    }
}
