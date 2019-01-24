package Chapter9;
import java.util.Date;
public class Exercise_07 {
    public static void main(String[] args){
        Account account1 = new Account(1122, 20000);
        account1.setAnnualInterestRate(4.5);
        account1.withDraw(2500);
        account1.deposit(3000);
        System.out.println(account1.getBalance() + "\n" + account1.getMonthlyInterestRate() + "\n" + account1.getDateCreated());
    }
}
class Account{
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    Account(){
    }
    Account(int userId,double userBalance){
        id = userId;
        balance = userBalance;
    }
    public int getId(){
        return id;
    }
    public void setId(int newId){
        id = newId;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(int newBalance){
        balance = newBalance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    public double getMonthlyInterestRate(){
        return balance * annualInterestRate / 100 / 12;
    }
    public void withDraw(double withDrawBalance){
        balance -= withDrawBalance;
    }
    public void deposit(double depositBalance){
        balance += depositBalance;
    }
}
