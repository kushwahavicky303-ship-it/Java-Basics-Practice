package objectorientedprogram;

public class finalkeywords {
    public static void main(String[] args){
        System.out.println("welcome to final keywords:");
        Rondom r1 = new Rondom();
        System.out.println(r1.PI);
        final int x;
        x = 4;
        System.out.println(x);
    }
}
      class Rondom{//class
    final double PI;//final keywors:

    Rondom(){//constructor
        this.PI = 3.14;
    }

      }
