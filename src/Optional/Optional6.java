package Optional;

import java.util.Optional;

public class Optional6 {
    public static void main(String args[]){

        System.out.println("welcome to the optional:");
        String course = "Spring boot";
        Optional<String> optional = Optional.ofNullable(course);
        if(optional.isPresent()) {
            System.out.println(optional.get());
        }
    }
}
