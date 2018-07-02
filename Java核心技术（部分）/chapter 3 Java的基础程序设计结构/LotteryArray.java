
public class LotteryArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int NMAX = 10;
		int[][] odds = new int[NMAX + 1][];
		int n;
		for(n = 0;n <= NMAX;n++)
				odds[n] = new int[n + 1];
		for(int m = 0;m < odds.length;m++)
			for(int k = 0;k < odds[m].length;k++)
			{
				int lotteryodds = 1;
				for(int i = 1;i < k;i++)
					lotteryodds = lotteryodds * (m - i + 1) / i;
				odds[m][k] = lotteryodds;
			}
		for(int[] row : odds)
		{
			for(int odd : row)
				System.out.printf("%4d", odd);
			System.out.println();
		}
	}
}