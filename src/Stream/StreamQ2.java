package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamQ2 {
    public static void main(String args[]){
        System.out.println("welcome to the stream practice:");
        List<String> list = new ArrayList<>(List.of(
                "java",
                "python",
                "spring",
                "java",
                "react",
                "angular",
                "spring",
                "html"));
        list.stream()
                .filter(name->name.length()>=5)
                .map(String::toUpperCase)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .forEach(System.out::println);
    }
}
