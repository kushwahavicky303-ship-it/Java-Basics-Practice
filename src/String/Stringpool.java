package String;

public class Stringpool {
    public static void main(String args[]){
        System.out.println("welcome to strings");
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1==s2);
        //s1 and s2 are String literals stored in the String Constant Pool, so both reference the same object.

        String s3 = new String("aditya");
        String s4 = new String("aditya");
        System.out.println(s3==s4);
        //s3 and s4 are created using the new keyword, so each creates a separate object in Heap memory.
        //Since == compares references, the first comparison is true and the second is false.
    }
}
