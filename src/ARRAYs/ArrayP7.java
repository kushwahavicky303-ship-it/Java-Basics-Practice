package ARRAYs;

public class ArrayP7 {
    public static void main(String args[]){
        System.out.println("welcome to the searching elements:");
        int[] arr = {10, 20, 30, 40, 50};
        boolean found =false;
        for(int i = 0; i<arr.length;i++){
            if(arr[i]==30){
                found =true;
                break;
            }
        }
        if(found){
            System.out.println("Element found:");
        }
        else{
            System.out.println("elements not found");
        }

    }
}
