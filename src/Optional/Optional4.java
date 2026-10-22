package Optional;

import java.util.Optional;

public class Optional4 {
    public static void main(String args[]){
        System.out.println("Welpcme to optional practices:");
        Optional<String> optional = Optional.of("Java");
        System.out.println(optional.get());
    }
}
