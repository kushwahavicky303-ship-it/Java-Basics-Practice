package AutoboxingandUnboxing;

public class Demo1 {
    public static void main(String[] args){
        System.out.println("welcome to cheking operators and equality:");
        int x = 100;
        int y = 100;
        System.out.println(x==y);
        // Primitive values are compared using ==
        Integer a= 200;
        Integer b = 200;
        System.out.println(a==b);
        //For wrapper objects, == compares references
        Integer c = 150;
        Integer d = 150;
        System.out.println(c.intValue()==d.intValue());
        //Java caches Integer objects from -128 to 127.
        // So both variables refer to the same object.
        Integer e = 100;
        Integer f = 100;
        System.out.println(e==f);
        //when you compare wrapper classes ,don't use == if you want to compare their values
        //use (.equals())
        Integer g = 100;
        Integer h = 100;
        System.out.println(g.equals(h));
        // returns true not because of caching, but because .equals() compares the values.
        Integer i = 200;
        Integer j = 200;
        System.out.println(i.equals(j));
    }
}
