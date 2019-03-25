package txDemo2;
/*
 * 转账DAO接口
 */
public interface AccountDao {
	public void outMoney(String from,Double money);
	public void inMoney(String to,Double money);
}
