package Chapter8;
import java.util.Scanner;
public class Exercise_01 {
	public static double sumColumn(double[][] m,int columnIndex) {
		double total = 0;
		for(int i = 0;i < m.length;i++)
			total += m[i][columnIndex];
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a 3-by-4 matrix row by row");
		double[][] m = new double[3][4];
		for(int i = 0;i < m.length;i++)
			for(int j = 0;j < m[i].length;j++)
				m[i][j] = input.nextDouble();
		int sum = 0;
		for(int i = 0;i < 4;i++) {
			System.out.println("sum of the elements at column " + i + " is " + sumColumn(m,i));
		}
	}

}
