package Enums;

public class Demo1 {
    public static void main(String args[]){
        System.out.println("welcome to Enums:");
        Direction d = Direction.EAST;
        System.out.println(d.getDegree());
    }
}
enum Direction{
    NORTH(0),
    SOUTH(180),
    EAST(90),
    WEST(360);
    private int degree;
    Direction(int degree){
        this.degree = degree;
    }
    public int getDegree(){
        return this.degree;
    }
}
