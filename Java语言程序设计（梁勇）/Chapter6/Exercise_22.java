package Chapter6;
import java.util.Scanner;
public class Exercise_22 {
    public static double sqrt(long n) {
        double nextGuess = 1.0;
        double lastGuess;
        do {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + (n / lastGuess)) * 0.5;
        }
        while (Math.abs(nextGuess - lastGuess) >= 0.00001);

        return nextGuess;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number:");
        long a = input.nextLong();
        System.out.print(sqrt(a));
    }
}
