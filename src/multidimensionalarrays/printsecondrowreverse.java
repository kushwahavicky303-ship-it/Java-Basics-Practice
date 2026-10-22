package multidimensionalarrays;

public class printsecondrowreverse {
    public static void main(String[] args){
        System.out.println("welcomee to second rows:");
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        for(int j=2; j>=0; j--){
            System.out.print(arr[2][j]+ " ");
        }
    }
}
