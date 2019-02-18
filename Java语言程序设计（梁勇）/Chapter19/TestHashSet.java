package Chapter19;
import java.util.*;
public class TestHashSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("NewYork");
        set.add("Beijing");
        set.add("NewYork");
        for (String s : set)
            System.out.print(s.toUpperCase() + " ");
    }
}
