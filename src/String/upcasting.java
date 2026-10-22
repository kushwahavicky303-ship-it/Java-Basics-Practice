package String;

public class upcasting {
    public static void main(String args[]){
        System.out.println("welcome to upcasting and down casting");
        String s = new String("hello");
        Object obj = s;
        System.out.println(obj);
        //downcasting.
        Object obj2 = "aditya";
        String s2 = (String)obj2;
        System.out.println(s2);
    }
}
