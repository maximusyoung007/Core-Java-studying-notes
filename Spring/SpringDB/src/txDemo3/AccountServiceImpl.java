package txDemo3;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/*
 * 转账业务层实现类
 */
@Transactional
public class AccountServiceImpl implements AccountService {
	//注入Dao
	private AccountDao accountDao;
	
	public void setAccountDao(AccountDao accountDao) {
		this.accountDao = accountDao;
	}


	public void transfer(String from,String to,Double money) {
		
				accountDao.outMoney(from, money);
				//在发生错误的情况下，若没有事务管理，outMoney执行而inMoney不执行；有事务管理，两者都不执行
				//int i = 1 / 0;
				accountDao.inMoney(to, money);
	}
}
