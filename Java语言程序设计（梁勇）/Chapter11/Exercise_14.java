package Chapter11;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_14 {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("enter five integers for list1:");
        int value;
        for(int i = 0;i < 5;i++){
            value = input.nextInt();
            list1.add(value);
        }
        System.out.print("enter five integers for list2:");
        for(int i = 0;i < 5;i++){
            value = input.nextInt();
            list2.add(value);
        }
        System.out.print("the combine list is ");
        list3 = union(list1,list2);
        for(int i = 0;i < list3.size();i++)
            System.out.print(list3.get(i) + " ");
    }
    public static ArrayList<Integer> union(ArrayList<Integer>list1,ArrayList<Integer>list2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i < list1.size();i++)
            list.add(list1.get(i));
        for(int i = 0;i < list2.size();i++)
            list.add(list2.get(i));
        return list;
    }
}
