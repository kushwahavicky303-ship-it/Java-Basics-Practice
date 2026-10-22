package TWODArrays;

public class ArrayQ5 {
    public static void main(String args[]){
        System.out.println("welcome to the 2D array:");
        int[][] arr = { {5, 10, 15},
                {20, 25, 30},
                {35, 40, 45}};
        int count =0;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j]%2==0){//for even if(arr[i][j]%2==0)
                    sum =sum+arr[i][j];
                    count++;
                }
            }
        }
        System.out.println("even numbers: " +count);
        System.out.println("sum of all even numbers: " +sum);
    }
}
