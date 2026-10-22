package functions;

public class FunctionOverloading3 {
    public static void main(String args[]){
        System.out.println("welcome to the function overloading:");
        int side = 5;
        int length =10,width = 4;
        double radius = 3;
        System.out.println("area: "+area(side));
        System.out.println("length: " +area(length,width));
        System.out.println("radius: " +area(radius));
    }
    static int area(int side){
        int result = side*side;
        return result;
    }
    static int area(int length ,int width){
        int result = length*width;
        return result;
    }
    static double area(double radius){
        double result = 3.14*radius*radius;
        return result;
    }
}
