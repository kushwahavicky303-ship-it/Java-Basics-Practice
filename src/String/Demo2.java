package String;

public class Demo2 {
    public static void main(String[] args){
        System.out.println("welcome to Strings:");
        String s1 = "ja" + "va";
        String s2 = "java";
        System.out.println(s1==s2);

        String s3 = "hello";
        String s4 = s3 + "world";
        String s5 = "hello world";
        System.out.println(s4==s5);

        String s6 = "hello";
        String s7 = s6;
        System.out.println(s6==s7);

        String s8 = "hello";
         s8       = "world";
        System.out.println(s8);//world

        String s9 = new String("hello");//heap memory-->hello
        String s10 = "hello";//string pool-->hello
        System.out.println(s9==s10);
    }
}
