package Interfaces;

public class Interfaces2 {
    public static void main(String[] args){
        System.out.println("welcome to interfaces using abstraction and child class");
        Car c = new BlackThar();
        c.Drive();
    }
}
interface Car{
    void Drive();
}
abstract class Thar implements Car{
    abstract public void Drive();
}
class BlackThar extends Thar{
    @Override
   public void Drive(){
        System.out.println("Black thar is driving ");
    }
}
