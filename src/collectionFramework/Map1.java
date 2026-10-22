package collectionFramework;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String args[]){
        System.out.println("welcome to map Interface:");
        Map<String,Integer> map = new HashMap<>();
        map.put("Aditya",10);
        map.put("shivam",20);
        map.put("johny",30);
        map.put("rahul",40);
        map.put("kamla",50);
        map.put("Aditya",60);
        System.out.println(map.size());
        System.out.println(map.get("Aditya"));
        System.out.println(map.containsKey("johny"));
        System.out.println(map.containsValue(50));
        System.out.println(map.remove("kamla"));
        System.out.println(map.size());
    }
}
