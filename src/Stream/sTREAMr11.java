package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class sTREAMr11 {
    public static void main(String args[]){
        System.out.println("welcome to the stream harder questions:");
        List<String> list = List.of(
                "Java", "Python", "JavaScript", "HTML",
                "CSS", "Spring Boot", "MySQL", "React",
                "Java", "Spring Boot");
        List<Character> result = list.stream()
                .distinct()
                .map(String::toUpperCase)
                .filter(x->x.length()>4)
                .map(x->x.charAt(0))
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(result);


    }
}
