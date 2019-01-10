package Chapter2;
import java.util.Scanner;
public class Exercise_11 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of years: ");
        int i = input.nextInt();
        int population;
        population = 312032486 + i * 365 * 24 * 3600 / 7 - i * 365 * 24 * 3600 / 13 + i * 365 * 24 * 3600 / 45;
        if(i == 1) {
            System.out.println(i + " year:" + population);
        }
        else
            System.out.println(i + " years:" + population);
    }
}
