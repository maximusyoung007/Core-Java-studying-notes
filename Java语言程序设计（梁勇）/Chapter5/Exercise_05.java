package Chapter5;
public class Exercise_05 {
    public static void main(String[] args) {
        System.out.printf("%10s%10s    |  %10s%10s\n", "kilograms", "pounds",
                "pounds", "kilograms");
        System.out.println("---------------------------------------------");
        int kilograms = 1;
        int pounds = 20;
        int count = 1;
        while (count <= 100) {
            System.out.printf("%10d%10.3f    |  %10d%10.3f\n", kilograms,
                    kilograms * 2.2, pounds, pounds / 2.2);
            kilograms += 2;
            pounds += 5;
            count++;
        }
    }
}

