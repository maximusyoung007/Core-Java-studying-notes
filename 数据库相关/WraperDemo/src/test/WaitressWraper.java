package test;

public class WaitressWraper implements Waiter {
	Waiter waiter = null;
	public WaitressWraper(Waiter waiter) {
		this.waiter = waiter;
	}
	
	@Override
	public void service() {
		System.out.println("simling...");
		waiter.service();
	}
}
