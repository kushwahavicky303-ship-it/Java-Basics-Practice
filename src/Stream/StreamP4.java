package Stream;

import java.util.List;

public class StreamP4 {
    public static void main(String args[]){
        System.out.println("welcome to the method:");
        List<String> list = List.of(
                "java",
                "python",
                "angular",
                "react",
                "java",
                "scala",
                "spring",
                "angular");
        list.stream()
                .filter(name->name.contains("a"))
                .map(String::toUpperCase)
                .distinct()
                .sorted()
                .skip(1)
                .forEach(System.out::println);
    }
} //doubt ye skip() list ke elements se skip krega ya after all operation appling
