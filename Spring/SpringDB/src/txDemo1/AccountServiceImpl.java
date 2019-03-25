package txDemo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/*
 * 转账业务层实现类
 */
public class AccountServiceImpl implements AccountService {
	//注入Dao
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}
	//注入事务管理的模板
	private TransactionTemplate transactionTemplate;
	
	
	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}



	public void transfer(String from,String to,final Double money) {
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus arg0) {
				// TODO Auto-generated method stub
				accountDao.outMoney(from, money);
				//在发生错误的情况下，若没有事务管理，outMoney执行而inMoney不执行；有事务管理，两者都不执行
				//int i = 1 / 0;
				accountDao.inMoney(to, money);
			}
			
		});
		
	}
}
