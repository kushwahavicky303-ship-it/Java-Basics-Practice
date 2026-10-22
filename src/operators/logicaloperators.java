package operators;

public class logicaloperators {
    public static void main(String[] args){
        System.out.println("welcome to logical operators:");
        int a = 5;
        int b = 10;
        int c = 15;
        boolean d = (a<b) && (b<c);//T  T-->T
        System.out.println(d);     //T  F-->F
        boolean e = (a>b) || (b<c);
        System.out.println(e);
        //also we can write like it
        System.out.println();
    }

}
