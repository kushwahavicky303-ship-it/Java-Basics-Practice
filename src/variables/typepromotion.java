package variables;

public class typepromotion {
    public static void main(String[] args){
        System.out.println("welcome to type promotion:");
        byte b = 42;
        char c ='a';
        int i = 50000;
        short s = 1024;
        float f = 5.67f;
        double d = .1234;

        double result =((f*b)+(i/c)-(d*s));
        System.out.println("result is=" +result);
    }
}
