package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamR10 {
    public static void main(String args[]){
        System.out.println("welcome to the stream:");
        List<String> list = List.of(
                "Java", "Python", "JavaScript", "HTML",
                "CSS", "Spring Boot", "MySQL", "React",
                "Java", "Spring Boot"
        );
        List<Integer> result = list.stream()
                .distinct()
                .map(String::toLowerCase)
                .filter(x->x.contains("a"))
                .map(String::length)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println("final list is:" +result);


    }
}
