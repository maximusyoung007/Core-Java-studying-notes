package Chapter11;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_11 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        int value = 0;
        System.out.print("enter 5 integers:");
        Scanner input = new Scanner(System.in);
        for(int i = 0;i < 5;i++){
            value = input.nextInt();
            list.add(value);
        }
        sort(list);
        for(int i = 0;i < 5;i++)
            System.out.print(list.get(i) + " ");
    }
    public static void sort(ArrayList<Integer> list){
        for(int i = 1;i < list.size();i++){
            for(int j = 0;j < list.size() - i;j++){
                if(list.get(j) > list.get(j + 1)){
                    int temp = list.get(j);
                    list.set(j,list.get(j + 1));
                    list.set(j + 1,temp);
                }
            }
        }
    }
}
