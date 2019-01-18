package Chapter5;
public class Exercise_19 {
    public static void main(String[] args) {
        int number = 0;
        for (int row = 0; row <= 7; row++) {
            for (int col = 1; col <= 7 - row; col++)
                System.out.printf("%4s", " ");
            for (int col = 0; col <= row; col++) {
                number = (int)Math.pow(2, col);
                System.out.printf("%4d", number);
            }
            for (int col = row - 1; col >= 0; col--) {
                number = (int)Math.pow(2, col);
                System.out.printf("%4d", number);
            }
            System.out.print('\n');
        }
    }
}


