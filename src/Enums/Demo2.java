package Enums;

public class Demo2 {
    public static void main(String args[]){
        System.out.println("welcome to values() methods:");
            //valueof() method--> it returs only one constant..
            Day today = Day.valueOf("MONDAY");
            System.out.println(today);
    }
}
enum Day{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}
