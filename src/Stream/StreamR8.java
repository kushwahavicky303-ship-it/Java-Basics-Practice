package Stream;

import java.util.Comparator;
import java.util.List;

public class StreamR8 {
    public static void main(String args[]){
        System.out.println("welcome to the streams:");
        List<String> list = List.of( "java", "python", "javascript", "html",
                "css", "java", "spring", "mysql", "react");
        list.stream()
                .distinct()
                .filter(name->name.length()>4)
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .skip(1)
                .limit(3)
                .forEach(System.out::println);
    }
}
