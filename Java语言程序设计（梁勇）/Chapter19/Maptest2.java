package Chapter19;
import java.util.*;
public class Maptest2 {
    public static void main(String[] args) {

        // create a new linked hash map
        LinkedHashMap map = new LinkedHashMap(5);

        // add some values in the map
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        // print the map
        System.out.println("Map:" + map);

        // get key "Three"
        System.out.println("" + map.get("Three"));

        // get key "Five"
        System.out.println("" + map.get("Five"));
    }
}
