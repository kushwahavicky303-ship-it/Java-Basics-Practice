package multidimensionalarrays;

public class mutlidimensionalarray {
    public static void main(String[] args){
        System.out.println("welcome to multidimensional array:");
        System.out.println("printing two d arrays:");
        int[][] arr = new int[3][];
         arr[0] = new int[1];
         arr[1] = new int[2];
         arr[2] = new int[3];

         arr[0][0] = 12;
         arr[1][0] = 13;
         arr[1][1] = 32;
         arr[2][0] = 33;
         arr[2][1] = 15;
         arr[2][2] = 16;

          for(int i=0; i<arr.length; i++){
              for(int j=0; j<arr[i].length; j++){
                  System.out.print(arr[i][j]+ " ");
              }
              System.out.println();
          }

    }
}
