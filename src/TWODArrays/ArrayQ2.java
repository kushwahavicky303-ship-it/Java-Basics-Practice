package TWODArrays;

public class ArrayQ2 {
    public static void main(String args[]){
        System.out.println("welcome to the 2D arrays: ");
        int[][] arr = {
                {10,20,30},
                {40,50,60},
                {70,80,90}
        };
        for(int i=0; i<arr.length; i++){//it controls the rows
            for(int j=0; j<arr[i].length; j++){//it controls the columns
                System.out.print(arr[i][j]+ " ");//print() keeps the printing on the same line.
            }
            System.out.println();//this mooves the cursor to the next line.
        }

    }
}
//In a 2D array, the outer loop traverses the rows, while the inner loop traverses the columns.