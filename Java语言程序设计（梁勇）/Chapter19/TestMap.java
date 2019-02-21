package Chapter19;
import java.util.*;
public class TestMap {
    public static void main(String[] args){
        Map<String,Integer> hashMap = new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("Lewis",21);
        hashMap.put("Cook",29);

        System.out.println("Display entries in HashMap");
        System.out.println(hashMap + "\n");

        Map<String,Integer> treeMap = new TreeMap<>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String,Integer> map = new LinkedHashMap<>(16,0.75f,true);
        map.put("Smith",30);
        map.put("Anderson",31);
        map.put("Lewis",21);
        map.put("Cook",29);
        System.out.println("\nthe age for " + "Smith is " + map.get("Smith"));

        System.out.println("Display entries in LinkHashMap");
        System.out.println(map);
    }
}
