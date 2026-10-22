package Optional;

import java.util.Optional;

public class Optional5 {
    public static void main(String args[]){
        System.out.println("Welcome to the Optional practices:");
        String name = null;
        Optional<String> result = Optional.ofNullable(name);
        System.out.println(result.orElse("Python"));
    }
}
