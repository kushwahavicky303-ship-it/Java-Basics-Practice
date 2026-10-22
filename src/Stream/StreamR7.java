package Stream;

import java.util.List;

public class StreamR7 {
    public static void main(String args[]){
        System.out.println("welcome to the stream prcatices :");
        List<String> list = List.of("java", "python", "javascript", "html", "css");
        list.stream()
                .filter(name->name.length()>4)
                .forEach(System.out::println);
    }
}
