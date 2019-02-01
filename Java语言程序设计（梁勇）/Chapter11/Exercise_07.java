package Chapter11;
import java.util.ArrayList;
public class Exercise_07 {
    public static void shuffle(ArrayList<Integer> list){
        for(int i = 0;i < list.size();i++){
            int index = (int)(Math.random() * list.size());
            int temp = list.get(index);
            list.set(index,list.get(i));
            list.set(i,temp);
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(Integer i = 1;i < 10;i++)
            list.add(i);
        shuffle(list);
        for(int i = 0;i < list.size();i++)
            System.out.print(list.get(i) + " ");
    }
}
