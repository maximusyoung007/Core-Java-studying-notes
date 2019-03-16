package DBUtils;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.junit.Test;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import domain.Account;

public class TestDBUtils {
	@Test
	public void testInsert() throws SQLException{
		ComboPooledDataSource ds =  new ComboPooledDataSource();
		QueryRunner queryRunner = new QueryRunner(ds);
		queryRunner.update("insert into account values(8,?,?)","aaa",1000);
		queryRunner.update("delete from account where id= ?",1);
		queryRunner.update("update account set money = ? where id = ?",666,7);
		//去执行查询，查询到的数据还是在哪个result里面。 然后调用下面的handle方法，由用户手动去封装。
				/*Account  account =  queryRunner.query("select * from account where id = ?", new ResultSetHandler<Account>(){

					@Override
					public Account handle(ResultSet rs) throws SQLException {
						Account account  =  new Account();
						while(rs.next()){
							String name = rs.getString("name");
							int money = rs.getInt("money");
							
							account.setName(name);
							account.setMoney(money);
						}
						return account;
					}
					 
				 }, 6);
				
				System.out.println(account.toString());
				*/
				
				
				// 通过类的字节码得到该类的实例
				
		/*		
				Account a = new Account();
				
				//创建一个类的实例。
				Account a1=  Account.class.newInstance();
				*/
				
				
				//查询单个对象
				Account account = queryRunner.query("select * from account where id = ?", 
						new BeanHandler<Account>(Account.class), 8);
				System.out.println(account.toString());
				
				/*List<Account> list = queryRunner.query("select * from account ",
						new BeanListHandler<Account>(Account.class));
				
				for (Account account : list) {
					System.out.println(account.toString());
				}*/
	}
}
