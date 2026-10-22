package Optional;

import java.util.Optional;

public class OptionalP2 {
    public static void main(String args[]){
        System.out.println("welcome to the Optional method:");
        String course = null;
        Optional<String> result = Optional.ofNullable(course);//here we cannot use >of()
        System.out.println(result);
        System.out.println(result.orElse("Spring Boot"));
    }
}
