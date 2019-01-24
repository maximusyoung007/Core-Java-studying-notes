package Chapter8;
import java.util.Scanner;
public class Exercise_02 {
	public static double sumMajorDiagonal(double[][] m) {
		double sum = 0;
		for(int i = 0;i < m.length;i++)
			for(int j = 0;j < m[i].length;j++) {
				if(i == j)
					sum += m[i][j];
			}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("enter a 4-by-4 matrix row by row");
		double[][] m = new double[4][4];
		for(int i = 0;i < m.length;i++)
			for(int j = 0;j < m[i].length;j++) {
				m[i][j] = input.nextDouble();
			}
		double sum = sumMajorDiagonal(m);
		System.out.println("sum of the elements in major diagonal is " + sum);
	}

}
