package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamR9 {
    public static void main(String args[]){
        System.out.println("Wellcome to the stream medium question:");
        List<String> list = List.of( "Java", "Python", "JavaScript", "HTML",
                "CSS", "Spring", "MySQL", "React");
        List<String> result=list.stream()
                .map(String::toLowerCase)
                .filter(x->x.contains("a"))
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
