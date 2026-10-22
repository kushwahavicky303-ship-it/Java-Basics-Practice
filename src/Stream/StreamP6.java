package Stream;

import java.util.Comparator;
import java.util.List;

public class StreamP6 {
    public static void main(String args[]){
        System.out.println("welcome to the method:");
        List<String> list = List.of(
                "JAVA",
                "SPRING",
                "REACT",
                "PYTHON",
                "ANGULAR",
                "SPRING",
                "DOCKER",
                "JAVA");
        list.stream()
                .filter(name->name.length()>=5)
                .map(String::toLowerCase)
                .filter(name->name.contains("r"))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .forEach(System.out::println);



    }
}//neeche theory questions bhi ask krlena 2 points only
