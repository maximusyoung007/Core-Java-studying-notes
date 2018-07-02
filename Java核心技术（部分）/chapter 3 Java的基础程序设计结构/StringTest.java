
public class StringTest {

	public static void main(String[] args) {
			String a = "Hello";
			System.out.println(a);
			String s = a.substring(0,3);
			System.out.println(s);
			String b = "wor";
			System.out.println(a + " " + b + "ld");
			String h = a.substring(0,3) + "p!";
			"helle".equals(a);
			if(a.compareTo("Hello") == 0) {
				int x = 3;
				System.out.println(x);
			}
			int n = a.length();
			System.out.println(n);
			int cpcount = a.codePointCount(0, a.length());
			System.out.println(cpcount);
			char first = a.charAt(0);
			char last = a.charAt(4);
			System.out.println(first);
			System.out.println(last);
			int index = a.offsetByCodePoints(0, 0);
			int cp = a.codePointAt(index);
			System.out.println(cp);
		}
}
