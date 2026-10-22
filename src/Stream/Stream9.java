package Stream;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class Stream9 {
    public static void main(String args[]){
        System.out.println("welcome to stream():");
        List<String> list = List.of( "java",
                "python",
                "spring",
                "javascript",
                "react",
                "angular",
                "html",
                "css");
        list.stream()
                .filter(name->name.length()>=6)
                .map(String::toUpperCase)
                .filter(name->name.contains("R"))
                .map(name->name.replace("R","#"))
                .forEach(System.out::println);
    }
}
