package flowofcontrrols;

public class switchstatements {
    public static void main(String[] args){
        System.out.println("welcome to switch stateents:");
        int i = 7;//3 then output will be 3
        switch(i){
            case 1:
                System.out.println("i is 1");
                break;//if i remove break statement then it will jump next and print each lines
            case 2:
                System.out.println("i is 2");
                break;
            case 3:
                System.out.println("i is 3");
                break;
            default:
                System.out.println("i is gretaer than 3");
                break;



        }
    }
}
