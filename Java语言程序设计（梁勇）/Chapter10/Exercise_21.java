package Chapter10;
import java.math.BigInteger;
public class Exercise_21 {
    public static void main(String[] args){
        BigInteger num = new BigInteger(Long.MAX_VALUE + "");
        num = num.add(BigInteger.ONE);
        int count = 0;
        while(count < 10){
            if(num.remainder(new BigInteger("5")).equals(BigInteger.ZERO) || num.remainder(new BigInteger("6")).equals(BigInteger.ZERO)){
                System.out.println(num);
                count++;
            }
            num = num.add(BigInteger.ONE);
        }
    }
}
