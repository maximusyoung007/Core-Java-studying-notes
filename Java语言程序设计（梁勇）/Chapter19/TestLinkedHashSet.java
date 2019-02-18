package Chapter19;
import java.util.LinkedHashSet;
import java.util.Set;
public class TestLinkedHashSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("London");
        set.add("Paris");
        set.add("NewYork");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("NewYork");
        System.out.println(set);
        for (String element : set)
            System.out.print(element.toLowerCase() + " ");
    }
}
