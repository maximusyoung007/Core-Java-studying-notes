package Chapter3;
import java.util.Scanner;
public class Exercise_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "Enter an amount in double, for example 11.56: ");
        double amount = input.nextDouble();
        int remainingAmount = (int)(amount * 100);
        int numberOfOneDollars = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;
        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;
        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int numberOfPennies = remainingAmount;
        if (amount < 0) {
            System.out.println("Your amount is negative");
            System.exit(1);
        }
        else if (amount < 0) {
            System.out.println("Your amount is zero");
            System.exit(2);
        }
        System.out.println("Your amount " + amount + " consists of ");
        if (numberOfOneDollars > 1)
            System.out.println(numberOfOneDollars + "\t dollars");
        else if (numberOfOneDollars == 1)
            System.out.println(numberOfOneDollars + "\t dollar");
        if (numberOfQuarters > 1)
            System.out.println(numberOfQuarters + "\t quarters");
        else if (numberOfQuarters == 1)
            System.out.println(numberOfQuarters + "\t quarter");
        if (numberOfDimes > 1)
            System.out.println(numberOfDimes + "\t dimes");
        else if (numberOfDimes == 1)
            System.out.println(numberOfDimes + "\t dime");
        if (numberOfNickels > 1)
            System.out.println(numberOfNickels + "\t nickels");
        else if (numberOfNickels == 1)
            System.out.println(numberOfNickels + "\t nickel");
        if (numberOfPennies > 1)
            System.out.println(numberOfPennies + "\t pennies");
        else if (numberOfPennies == 1)
            System.out.println(numberOfPennies + "\t penny");
    }
}
