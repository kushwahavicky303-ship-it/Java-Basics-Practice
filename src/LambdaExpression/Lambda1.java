package LambdaExpression;

public class Lambda1 {
    public static void main(String args[]){
        greeting g =()->{
            System.out.println("hello");
        };
        g.sayHello();
    }
}
@FunctionalInterface
interface greeting{
    void sayHello();

}

