package ARRAYs;

public class ArraysP6 {
    public static void main(String args[]){
        System.out.println("welcome to the count elements:");
        int[] arr = {10, 15, 20, 25, 30, 35, 40};
        int count = 0;
        for(int i= 0; i<arr.length; i++){
            if(arr[i]%2 != 0){//for even we use equal operator(==)
                count ++;
            }
        }
        System.out.println(+count);

    }
}
