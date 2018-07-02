import java.util.*;
/**
 * this program demonstrates the random shuffle and sort algorithms
 * @author Administrator
 *
 */
public class ShullfeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numbers = new ArrayList<>();
		for(int i = 1;i <= 49;i++)
			numbers.add(i);
		Collections.shuffle(numbers);
		List<Integer> winningCombination = numbers.subList(0,6);
		Collections.sort(winningCombination);
		System.out.println(winningCombination);
	}
}
