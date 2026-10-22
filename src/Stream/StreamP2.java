package Stream;

import java.util.ArrayList;
import java.util.List;

public class StreamP2 {
    public static void main(String args[]){
        System.out.println("welcome to the stream methods:");
        List<String> list = new ArrayList<>(List.of(
                "java",
                "python",
                "spring",
                "react",
                "javascript",
                "css",
                "sql"));
        list.stream()
                .filter(name->name.length()>4)
                .map(String::toUpperCase)
                .filter(name->name.startsWith("J") || name.startsWith("S"))
                .forEach(System.out::println);

    }
}
