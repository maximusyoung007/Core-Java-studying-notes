package Chapter10;
import java.math.*;
public class Exercise_21_02 {
    public static void main(String[] args) {
        BigInteger bigNum = new BigInteger(Long.MAX_VALUE + "");
        bigNum.add(BigInteger.ONE);
        int count = 1;
        while (count <= 10) {
            if (bigNum.remainder(new BigInteger("5")).equals(BigInteger.ZERO) ||
                    bigNum.remainder(new BigInteger("6")).equals(BigInteger.ZERO)) {
                System.out.println(bigNum);
                count++;
            }
            bigNum = bigNum.add(BigInteger.ONE);
        }
    }
}
