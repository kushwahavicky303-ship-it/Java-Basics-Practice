package ARRAYs;

public class ArrayS13 {
    public static void main(String args[]){
        System.out.println("welcome to the positive and negative numbers:");
        int arr[] = {10, -5, 8, -12, 0, 15, -3};
        int positiveumber = 0;
        int negavenumber = 0;
        int Zeronumber =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0){
                System.out.println("positive: " +arr[i]);
                positiveumber++;
            }
            if(arr[i]<0){
                System.out.println("Negative: " +arr[i]);
                negavenumber++;
            }
            if(arr[i]==0){
                System.out.println("zeroes: " +arr[i]);
                Zeronumber++;
            }
        }
        System.out.println("positive counts: " +positiveumber);
        System.out.println("negative counts: " +negavenumber);
        System.out.println("how many zeroes: " +Zeronumber);


    }
}
