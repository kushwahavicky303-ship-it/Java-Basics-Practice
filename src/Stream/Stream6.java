package Stream;

import java.util.List;

public class Stream6 {
    public static void main(String args[]){
        System.out.println("welcome to Stream()");
        List<String> list = List.of("java","python","html","spring","css","javascript");
        list.stream()
                .filter(name-> name.length()>5)//arr.length and string.length()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
