package Chapter12;
import java.util.Scanner;
public class Exercise_03 {
    public static void main(String[] args){
        int[] num = new int[100];
        for(int i = 0;i < 100;i++){
            num[i] = (int)(Math.random() * 100);
        }
        Scanner input = new Scanner(System.in);
        boolean havaAnswer = false;
        do{
            try{
                System.out.print("enter an index:");
                int index = input.nextInt();
                System.out.print(num[index]);
                havaAnswer = true;
            }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("the index you enter is beyond bounds,please enter again:");
                input.nextLine();
            }
        }while(havaAnswer == false);
    }
}
