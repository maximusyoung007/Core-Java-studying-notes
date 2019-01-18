package Chapter5;

import java.util.Scanner;

public class Exercise_16 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("input a integer:");
        n = input.nextInt();
        int b = n;
        while(n > 0){
            for (int j = 2; j < b; j++) {
                if (n % j == 0) {
                    System.out.print(j + " ");
                    n = n / j;
                    break;
                }
            }
        }
    }
}

