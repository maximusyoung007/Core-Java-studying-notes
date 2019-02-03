package Chapter13;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_02 {
    public static void shuffle(ArrayList<Number> list){
        for(int i = 0;i < list.size();i++){
            int index = (int)(Math.random() * list.size());
            java.lang.Number temp = list.get(index);
            list.set(index,list.get(i));
            list.set(i,temp);
        }
    }
    public static void main(String[] args){
        System.out.print("enter 10 integers:");
        Scanner input = new Scanner(System.in);
        ArrayList<Number> list = new ArrayList<>();
        for(int i = 0;i < 10;i++){
            int value = input.nextInt();
            list.add(value);
        }
        shuffle(list);
        for(int i = 0;i < list.size();i++)
            System.out.print(list.get(i) + " ");
    }
}
