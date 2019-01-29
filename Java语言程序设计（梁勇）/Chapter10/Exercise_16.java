package Chapter10;
import java.math.BigInteger;
public class Exercise_16 {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger("10000000000000000000000000000000000000000000000000");
        bigNum.add(BigInteger.ONE);
        int count = 1;
        while (count <= 10) {
            if (bigNum.remainder(new BigInteger("2")).equals(BigInteger.ZERO) || bigNum.divide(new BigInteger("3")).equals(BigInteger.ZERO)) {
                System.out.println(bigNum);
                count++;
            }
             bigNum = bigNum.add(BigInteger.ONE);
        }
    }
}