import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] luckynumbers = {1,2,3,4,12,12};
		int[] copyluckynumber = Arrays.copyOf(luckynumbers,luckynumbers.length + 1);
		//length of second array
		for(int element:copyluckynumber)
				System.out.println(element);
		
	}

}
