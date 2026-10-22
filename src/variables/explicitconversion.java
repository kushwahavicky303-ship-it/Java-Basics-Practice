package variables;

public class explicitconversion {
    public static void main(String[] args){
        int i = 24;
        byte b;
       // b = i;here we have to use casting
        b =(byte)i;
        System.out.println(b);

      float f = 15.343f;
      int a;
      a =(byte)f;
        System.out.println(a);


    }
}
