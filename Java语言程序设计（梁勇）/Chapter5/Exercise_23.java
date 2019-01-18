package Chapter5;
public class Exercise_23 {
    final static int N = 50000;
    public static void main (String[] args) {
        double sum = 0.0;
        for (int i = N; i >= 1; i--)
            sum += 1.0 / (double)(i);
        System.out.println("The result of the backward computation " + sum);
        double sum1 = 0.0;
        for (int i = 1; i <= N; i++)
            sum1 += 1.0 / (double)(i);
        System.out.println("The result of the forward computation " + sum1);
        double difference = sum - sum1;
        System.out.println("difference is " + difference);
    }
}
