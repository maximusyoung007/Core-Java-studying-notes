import java.math.*;
import java.util.*;
public class BigIntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("how many numbers do you need to draw?");
		int k = in.nextInt();
		System.out.print("what is the highest number you can draw?" );
		int n = in.nextInt();
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		int i;
		for(i = 1;i <= k;i++);
			lotteryOdds = lotteryOdds.
					multiply(BigInteger.valueOf(n - i + 1)).
					divide(BigInteger.valueOf(i));
			System.out.println
			("your odds are 1 in " + lotteryOdds + ".Good luck!");
	}

}
