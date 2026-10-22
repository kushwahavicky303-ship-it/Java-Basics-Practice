package multidimensionalarrays;

public class columnprint {
    public static void main(String[] args){
        System.out.println("welcome to one columns printing");
        int[][] arr = {{10,20,30},{40,50,60},{70,80,90}};

        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i][0]+ " ");
        }

    }
}
