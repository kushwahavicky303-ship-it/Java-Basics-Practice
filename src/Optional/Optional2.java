package Optional;

import java.util.Optional;

public class Optional2 {
    public static void main(String args[]){
        String language = null;//can change such as "java";
        System.out.println("Welcome to the optional class:");
        Optional<String> name = Optional.ofNullable(language);
        System.out.println(name);
    }
}
