package Chapter7;
import java.util.Scanner;
public class Exercise_12 {
    public static int[] reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        int[] num = new int[10];
        for (int i = 0; i < 10; i++)
            num[i] = input.nextInt();
        reverse(num);
        for (int i = 0; i < 10; i++)
            System.out.print(num[i] + " ");
    }
}
