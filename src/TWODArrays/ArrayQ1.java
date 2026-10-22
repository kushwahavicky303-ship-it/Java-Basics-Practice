package TWODArrays;

public class ArrayQ1 {
    public static void main(String args[]){
        System.out.println("welcome to the 2D arrays:");
        int[][] arr = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        System.out.println(arr[0][0]);
        System.out.println(arr[1][2]);
        System.out.println(arr[2][0]);
        System.out.println(arr[2][2]);
        System.out.println("Number of rows: " +arr.length);
        System.out.println("Number of columns: " +arr[0].length);
    }
}
