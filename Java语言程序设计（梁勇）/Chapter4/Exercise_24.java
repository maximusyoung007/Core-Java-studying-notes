package Chapter4;
import java.util.Scanner;
public class Exercise_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter city1:");
        String city1 = input.nextLine();
        System.out.println("enter city2:");
        String city2 = input.nextLine();
        System.out.println("enter city3");
        String city3 = input.nextLine();
        String temp = " ";
        if(city1.compareTo(city2) >= 0){
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        if(city2.compareTo(city3) > 0){
            temp = city2;
            city2 = city3;
            city3 = temp;
        }
        if(city1.compareTo(city2) > 0){
            temp = city1;
            city1 = city2;
            city2 = temp;
        }
        System.out.print("this three cities in alphabetical order are " + city1 + " " + city2 + " " + city3);
    }
}
