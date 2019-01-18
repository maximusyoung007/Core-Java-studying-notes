package Chapter5;
public class Exercise_20 {
    public static void main(String[] args) {
        int count = 1;
        int number = 2;
        boolean isPrime = true;
        System.out.println("The prime numbers from 2 to 1000 are \n");
        while (number <= 1000) {
            isPrime = true;
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;  // Exit the for loop
                }
            }
            if (isPrime) {
                if (count % 8 == 0) {
                    System.out.println(number);
                }
                else
                    System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }
}
