import java.util.Date;

public class OutputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 10000.0 / 3.0;
		System.out.println(a);
		System.out.printf("%8.2f\n",a);//have a blank at first place
		String name = "yang";
		int age = 2;
		System.out.printf("hello,%s,next year,you will be %d years old\n",
				name,age + 1);
		System.out.printf("%,.3f\n",10000.0 / 3.0);
		System.out.printf("%,(.2f\n",10000.0 / 3.0);
		System.out.printf("-%,(.2f\n",10000.0 / (-3.0));//put negative in parentheses
		//创建一个格式化的字符串
		String message = String.format("hello,%s,you will be %d years old next year\n",name,age + 1);
		System.out.printf(message);
		System.out.printf("%tc\n",new Date());//output present date and time 
		System.out.printf("%tD\n",new Date());
		System.out.printf("%tT\n",new Date());
		System.out.printf("%tr\n",new Date());
		System.out.printf("%tR\n",new Date());
		System.out.printf("%tB\n",new Date());
		System.out.printf("%tY\n",new Date());
		System.out.printf("%ta\n",new Date());
		System.out.printf("%tA\n",new Date());
		System.out.printf("%tM\n",new Date());
		System.out.printf("%tS\n",new Date());
		System.out.printf("%tL\n",new Date());
		System.out.printf("%tp\n",new Date());
		System.out.printf("%1$s %2$tB %2$te,%2$tY\n","Due date:",new Date());
		System.out.printf("%s %tB %<te, %<tY","Due date:", new Date());
	}

}
