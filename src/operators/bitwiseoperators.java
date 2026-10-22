package operators;

public class bitwiseoperators {
    public static void main(String[] args){
        System.out.println("welcome to bitwise operators:");
        int a = 2;//00000000 00000000 00000000 00000010(32bits)
        int b = 3;//00000000 00000000 00000000 00000011(32bits)
        int c = a & b;//10-->2
        int d = a|b;  //11-->3
        int e = a^c;  //01-->1
        int f = ~a;//11111111 11111111 11111111 11111101-->-3
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
