package String;

public class Demo3 {
    public static void main(String args[]){
        System.out.println("welcome to strings methiods:");
        //null
        String s1 = new String();
        System.out.println(s1);
        //new operator
        String s2 = new String("hello");
        System.out.println(s2);
        //char array
        char[] arr = {'a','d','i','t','y','a'};
        String s3 = new String(arr);
        System.out.println(s3);
        //charecter array subset.
        String s4 = new String(arr , 0,3);
        System.out.println(s4);
        //string bilder and String buffer
        StringBuilder sb = new StringBuilder("hello");
        String s5 = new String(sb);
        System.out.println(s5);
        //string buffer
        StringBuffer sb1= new StringBuffer("hello");
        String s6 = new String(sb1);
        System.out.println(s6);

    }
}
