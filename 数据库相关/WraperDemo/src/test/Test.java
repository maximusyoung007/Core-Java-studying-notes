package test;

public class Test {
	public static void main(String[] args) {
		//Waiter w = new Waitress();
		//w.service();
		WaitressWraper waitressWarp = new WaitressWraper(new Waitress());
		waitressWarp.service();
	}
}
