package Chapter5;
public class Exercise_18_04 {
    public static void main(String[] args) {
        for(int m = 1;m <= 6;m++){
            System.out.print(m + " ");
        }
        System.out.println();
        for (int i = 2; i <= 6; i++) {
            for (int j = 1; j <= (i - 1) * 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 7 - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
