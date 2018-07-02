//import java.io.Console;
import java.util.*;
public class InputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = in.nextLine();
		System.out.println("how old are you?");
		int age = in.nextInt();
		System.out.println("hello," + name + 
				" ,next year,you will be " + (age+1) + " years old");
		//Console cons = System.console();
		//String username = cons.readLine("user name:");
		//char[] passwd = cons.readPassword("password:");
	}

}
