package Stream;

import java.util.List;

public class Stream7 {
    public static void main(String args[]){
        System.out.println("welcome to Stream():");
        List<String> list = List.of("java", "python", "html", "spring", "css", "javascript", "sql");
        list.stream()
                .filter(name-> name.length()>4)
                .map(String::toUpperCase)
                .filter(name->name.startsWith("P") || name.startsWith("J"))
                .forEach(System.out::println);


    }
}
