package Chapter5;
public class Exercise_03 {
    public static void main(String[] args) {
        System.out.printf("%-14s%-10s\n", "Kilograms", "Pounds");
        System.out.println("--------------------");
        int kilograms = 1;
        while (kilograms < 200) {
            System.out.printf("%-14d%-10.1f\n", kilograms, kilograms * 2.2);
            kilograms += 2;
        }
    }
}

