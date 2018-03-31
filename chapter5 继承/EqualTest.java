
public class EqualTest {
	public static void main(String[] args)
	{
		Employee3 alice1 = new Employee3("Alice Adams",75000,1987,12,15);
		Employee3 alice2 = alice1;
		Employee3 alice3 = new Employee3("Alice Adams",75000,1987,12,15);
		Employee3 bob = new Employee3("Bob Brandson",50000,1989,10,1);
		System.out.println("alice == alice2:" + (alice1 == alice2));
		System.out.println("alice1 == alice3" + (alice1 == alice3));
		System.out.println("alice1.equals(alice3)" + alice1.equals(alice3));
		System.out.println("alice1.equals(bob):" + alice1.equals(bob));
		System.out.println("bob.toString()" + bob);
		
		Manager2 carl = new Manager2("Carl Cracker",80000,1987,12,15);
		Manager2 boss = new Manager2("Carl Carcker",80000,1987,12,15);
		boss.setBonus(5000);
		System.out.println("boss.toString():"+ boss);
		System.out.println("carl.equal(boss):" + carl.equals(boss));
		System.out.println("alice1.hashCode():" + alice1.hashCode());
		System.out.println("(alice3.hashcode():" + alice3.hashCode());
		System.out.println("bob.hashCode():" +bob.hashCode());
		System.out.println("carl.hashCode():" + carl.hashCode());
	}
}
