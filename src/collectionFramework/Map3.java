package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Map3 {
    public static void main(String args[]){
        System.out.println("welcome to map interfaces:\n");
        Map<String,Integer> map = new HashMap<>();
        map.put("Math",90);
        map.put("Science",85);
        map.put("English",80);
        map.put("Hindi",92);
        map.put("Computer",95);
        System.out.println("Map interface is:");
        System.out.println(map);

        System.out.println("after update english marks:");
        System.out.println(map.put("English",91));

        System.out.println("Remove Hindi:");
        System.out.println(map.remove("Hindi"));

        System.out.println("Computer marks:");
        System.out.println(map.get("Computer"));

        System.out.println("Math exists:");
        System.out.println(map.containsKey("Math"));

        System.out.println("100 exists:");
        System.out.println(map.containsValue(100));

        System.out.println("Final Map:");
        System.out.println(map);

        System.out.println("Size of map is:");
        System.out.println(map.size());




    }
}
