package Chapter11;
import javafx.scene.shape.Circle;
import java.util.Date;
import java.util.ArrayList;
public class Exercise_06 {
    public static void main(String[] args){
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Date());
        list.add("this is a string");
        list.add(new Circle());
        for(Object result : list){
            System.out.println(result.toString());
        }
    }
}
