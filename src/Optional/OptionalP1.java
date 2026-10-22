package Optional;

import java.util.Optional;

public class OptionalP1 {
    public static void main(String args[]){
        System.out.println("welcome to the Optional:");
        Optional<String> result = Optional.of("Java");
        System.out.println(result);//without get() method it will print such as Optional[value]
        System.out.println(result.get());//with get() method it will print such as Value
    }
}
