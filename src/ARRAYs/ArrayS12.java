package ARRAYs;

public class ArrayS12 {
    public static void main(String args[]){
        System.out.println("welcome to even odd number:");
        int arr[] = {12, 7, 18, 5, 20, 9, 14};
        int evencount = 0;
        int oddcount = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                System.out.println("even Elements: " +arr[i]);
                evencount++;//evencount = evencount+1;
            }
            else{
                System.out.println("odd elements: " +arr[i]);
                oddcount++;//oddcount = oddcount+1;
            }
        }
        System.out.println("Even count: " +evencount);
        System.out.println("Odd Count: " +oddcount);
    }
}
