package Stream;

import java.util.List;

public class StreamT6{

    public static void main(String args[]) {
        System.out.println("welcome to the anyMatch():");
        List<String> list = List.of( "Java",
                "Python",
                "Angular",
                "React",
                "Spring",
                "HTML");
        boolean result = list.stream()
                .map(String::toLowerCase)
                .filter(x->x.contains("r"))
                .anyMatch(x->x.length()>=6);

        System.out.println(result);

    }
}
