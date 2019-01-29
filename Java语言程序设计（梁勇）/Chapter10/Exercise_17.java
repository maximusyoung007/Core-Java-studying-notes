package Chapter10;
import java.math.BigInteger;
public class Exercise_17 {
    public static void main(String[] args) {
        BigInteger n = new BigInteger("" + (long)(Math.sqrt(Long.MAX_VALUE)));
        int count = 0;
        while(count < 10) {
            System.out.println(n.multiply(n));
            n = n.add(BigInteger.ONE);
            count++;
        }
    }
}

