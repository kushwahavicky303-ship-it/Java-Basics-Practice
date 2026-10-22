package Enums;

public class Demo5 {
    public static void main(String args[]){
        System.out.println("welcome to toString() method:");
        //Bank b = Bank.ACCOUNTNUMBER;
       // System.out.println(b.toString());
        Bank b2 = Bank.IFSC;
        System.out.println(b2);//java automatically calls .tostring(0 method
    }
}
enum Bank{
    ACCOUNTNUMBER,
    IFSC,
    CUSTOMERID,
    NAME,
    BRANCH;
    // can be overriddden.
    @Override
    public String toString(){
        return "bank name is" +name();
    }
}
