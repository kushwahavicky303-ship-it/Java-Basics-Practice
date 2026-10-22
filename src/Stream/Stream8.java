package Stream;

import java.util.List;

public class Stream8 {
    public static void main(String args[]){
        System.out.println("welcome to toughest question:");
        List<String> list = List.of("java",
                "python",
                "spring",
                "html",
                "javascript",
                "css",
                "sql");
        list.stream()
                .filter(name->name.length()>4)
                .map(String::toUpperCase)
                .filter(name->name.contains("A"))
                .forEach(System.out::println);

    }
}
