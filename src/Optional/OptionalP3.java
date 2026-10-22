package Optional;

import java.util.Optional;

public class OptionalP3 {
    public static void main(String args[]){
        System.out.println("welcome to Optional classes:");
        Optional<String> result = Optional.empty();
        System.out.println(result.isPresent());
        System.out.println(result.isEmpty());
    }
}
