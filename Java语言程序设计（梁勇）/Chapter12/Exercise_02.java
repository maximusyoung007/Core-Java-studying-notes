package Chapter12;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exercise_02 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        boolean continued = true;
        do{
            try{
                System.out.print("enter two integers:");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.print("the sum is " + (num1 + num2));
                continued = false;
            }
            catch (InputMismatchException ex){
                System.out.print("try again,you should input two integers.");
                input.nextLine();
            }
        }while(continued);
    }
}

