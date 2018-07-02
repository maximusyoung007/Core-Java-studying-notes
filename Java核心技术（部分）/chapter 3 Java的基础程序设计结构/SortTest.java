import java.util.Arrays;
public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 50,k = 7;
		int[] numbers = new int[n];
		for(int i = 0;i < numbers.length;i++)
				numbers[i] = i + 1;
			
		int[] result = new int[k];	
		for(int i = 0;i < result.length;i++){
//Math.random return a number between 0 and 1,so need to multiply 50
			int r = (int)(Math.random() * n);	
			result[i] = numbers[r];
			numbers[r] = numbers[n - 1];
			n--;
		}
		for(int r:result)
			System.out.print(r + " ");
		System.out.println();
		Arrays.sort(result);
		for(int element:result)
			System.out.print(element + " ");
	}
}
