package Chapter11;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_13 {
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0;i < list.size();i++){
            if(!list2.contains(list.get(i)))
                list2.add(list.get(i));
        }
        list.clear();
        for(int i = 0;i < list2.size();i++)
            list.add(list2.get(i));
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter ten integers:");
        ArrayList<Integer> list = new ArrayList<>();
        int value = 0;
        for(int i = 0;i < 10;i++){
            value = input.nextInt();
            list.add(value);
        }
        removeDuplicate(list);
        System.out.print("the distinct numbers are:");
        for(int i = 0;i < list.size();i++)
            System.out.print(list.get(i) + " ");
    }
}

