package Stream;

import java.util.List;
public class Streamt2 {
    public static void main(String args[]){
        System.out.println("welcome to terminal operation:");
        List<String> list = List.of(
                "Java",
                "Python",
                "Angular",
                "React",
                "Spring",
                "HTML",
                "Scala");
        long result = list.stream()
                .filter(name->name.length()>=5)
                .map(String::toLowerCase)
                .filter(name->name.contains("a"))
                .count();
        System.out.println(result);
    }
}
