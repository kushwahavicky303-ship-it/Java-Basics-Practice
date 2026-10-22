package multidimensionalarrays;

public class practisefirst {
    //2*2arrays stores;
    public static void main(String[] agrs){
        System.out.println("welcome to 2*2 matrix:");
        int[][] arr = new int[2][2];
        arr[0][0]= 10;
        arr[0][1]= 20;
        arr[1][0]= 30;
        arr[1][1]= 40;

        for(int i=0; i< arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
