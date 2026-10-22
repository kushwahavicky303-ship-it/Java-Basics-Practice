package encapsulation;

public class Encapsulation2 {
    public static void main(String args[]){
        System.out.println("Encapsulation question: ");
        BankAccount ba = new BankAccount();
        ba.setAccounHolder("john");
        ba.setIFSC("IPOS0000001");
        ba.setAccountNumber(955503405);
        ba.setBalance(100000000);
        System.out.println(ba.getBalance());
        System.out.println(ba.getAccounHolder());
        System.out.println(ba.getAccountNumber());
        System.out.println(ba.getIFSC());
    }
}
class BankAccount{
    private String accounHolder;
    private String IFSC;
    private int balance;
    private int accountNumber;
    //first setter and getter
    void setAccounHolder(String accounHolder){
        this.accounHolder = accounHolder;
    }
    String getAccounHolder(){
        return accounHolder;
    }
    //2nd getter and setter
    void setIFSC(String IFSC){
        this.IFSC = IFSC;
    }
    String getIFSC(){
        return IFSC;
    }
    //3rd setter and getter
    void setBalance(int balance){
        if(balance>=0){
            this.balance = balance;
        }
        else{
            System.out.println("Invalid balance");
        }
    }
    int getBalance(){
        return balance;
    }
    //4th setter and getter
    void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }
    int getAccountNumber(){
        return accountNumber;
    }


}