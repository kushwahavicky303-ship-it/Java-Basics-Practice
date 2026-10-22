



package multidimensionalarrays;

        public class twoDarray {
            public static void main(String[] args){
                System.out.println("welcome to 2D arrays");
                int[][] marks = new int[3][3];
                marks[0][0] =10;
                marks[0][1] =20;
                marks[0][2] =30;

                marks[1][0] =40;
                marks[1][1] =50;
                marks[1][2] =60;

                marks[2][0] =70;
                marks[2][1] =80;
                marks[2][2] =90;

                for(int i=0;i<marks.length;i++){//outer loop -->row
                    for(int j=0; j<marks[i].length; j++){//ineer loop-->columns
                        System.out.print(marks[i][j]+" ");

                    }
                    System.out.println();
                }

            }
        }