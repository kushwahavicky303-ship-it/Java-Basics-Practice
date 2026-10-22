package String;

public class methods{
    public static void main(String args[]){
        System.out.println("welcome to methods:");
        //length and emptiness
        String s1 = new String("aditya");
        System.out.println(s1.length());
        System.out.println(s1.isEmpty());
        System.out.println(s1.isBlank());

        //Charecter Access method
        String s2 = new String("aditya");
        System.out.println(s2.charAt(3));
        char[] arr = s2.toCharArray();
        for (char ch : arr) {
            System.out.println(ch);
        }

        //compare method
        String s3 = new String("aditya");
        String s4 = new String("aditya");
        System.out.println(s3.equals(s4));//compare 2 srtings
        System.out.println(s1.equalsIgnoreCase(s4));//ignore uppercase and lowercase
        System.out.println(s3.compareTo(s4));//+,-,0

        //searching method
        String s5 = new String("  aditya  ");
        System.out.println(s5.toUpperCase());
        System.out.println(s5.toLowerCase());
        System.out.println(s5.strip());
        System.out.println(s5.trim());
        System.out.println(s5.replace("adi","pri"));
        System.out.println(s5.substring(1));

        String s6 ="aditya , rohit , vikky";
        String[] array = s6.split("_");
        for(String s : array){
            System.out.println(s);
        }
        //conversion methods
        String s = "ABC";
        byte[] arr1 = s.getBytes();
        for(byte b : arr1){
            System.out.println(b);
        }
        int x = 100;
        String s7 = String.valueOf(x);
        System.out.println(s7);
        //advance method
        String name = "aditya";
        int age = 28;
        System.out.println(String.format("hello %s,your age is %s",name ,age));







    }
}
