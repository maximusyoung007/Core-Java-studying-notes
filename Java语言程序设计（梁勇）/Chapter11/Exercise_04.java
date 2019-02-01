package Chapter11;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise_04 {
    public static Integer max(ArrayList<Integer> list){
        Integer max = 0;
        for(int i = 0;i < list.size();i++){
            if(max < list.get(i))
                max = list.get(i);
        }
        return max;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter some integers(input ends with 0):");
        ArrayList<Integer> list = new ArrayList<>();
        int value;
        do{
            value = input.nextInt();
            if(!list.contains(value) && value != 0)
                list.add(value);
        }while(value != 0);
        System.out.print("the max number is " + max(list));
    }
}
