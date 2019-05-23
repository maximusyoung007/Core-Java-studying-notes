package ExceptionDemo;

public class Account {
    protected double balance;
   
    public Account(double balance) {
        this.balance = balance;
    }
   
    public double getBalance() {
        return balance;
    }
       
    public void deposit(double amt){
        this.balance += amt;
    }
    public void withdraw(double amt) throws OverDraftException{
        if(this.balance < amt)
            throw new OverDraftException("余额不足", amt-this.balance);
        this.balance -= amt;
    }
       
    public static void main(String[] args) {
        //开户存了1000
        Account a = new Account(1000);
        //存钱1000
        a.deposit(1000);
        //查看余额
        System.out.println(a.getBalance());
           
        try {
			a.withdraw(2001);
		} catch (OverDraftException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
           
    }
       
}