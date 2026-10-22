package AutoboxingandUnboxing;

public class autoboxing {
    public static void main(String[] args){
        System.out.println("welcometo autiboxing:");
        //autoboxing
        int x = 10;
        Integer y = x;
       // Integer y = Integer.valueOf(x);//you can also write it but new java accept upper case...
        System.out.println(x);
        System.out.println(y);
       // System.out.println(y.intValue());optional
        //unboxing
        Integer a = 20;
        int b = a;
        System.out.println(a);
        System.out.println(b);
    }
}
