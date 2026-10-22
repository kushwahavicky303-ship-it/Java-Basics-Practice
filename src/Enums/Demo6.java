package Enums;

public class Demo6 {
    public static void main(String args[]){
        System.out.println("welcome to ordinal() methods:");
        //return type is int.
        //indexing start from zero
        System.out.println(Bike.HFDELUX.ordinal());
        System.out.println(Bike.HERO.ordinal());
        System.out.println(Bike.HONDA.ordinal());
        System.out.println(Bike.PULSER.ordinal());
        System.out.println(Bike.APACHE.ordinal());
        System.out.println(Bike.HFDELUX.ordinal());
        System.out.println(Bike.BULLET.ordinal());
        System.out.println(Bike.SPLENDER.ordinal());

        }
}
enum Bike{
    HERO,
    HONDA,
    PULSER,
    APACHE,
    HFDELUX,
    SPLENDER,
    BULLET
}
