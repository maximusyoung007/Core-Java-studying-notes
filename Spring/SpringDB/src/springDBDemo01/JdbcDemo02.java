package springDBDemo01;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import domain.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcDemo02 {
	@Resource(name="jdbcTemplate")
	private JdbcTemplate jdbcTemplate;
	//保存操作
	@Test
	public void demo01() {
		jdbcTemplate.update("insert into account values (null,?,?)","go语言",10000);
	}
	//修改
	@Test
	public void demo02() {
		jdbcTemplate.update("update account set name = ? ,money = ? where id = ?","张三丰",20,8);
	}
	//删除
	@Test
	public void demo03() {
		jdbcTemplate.update("delete from account where id = ?",4);
	}
	//查询
	@Test
	public void demo04() {
		String name = jdbcTemplate.queryForObject("select name from account where id = ?",String.class,6);
		System.out.println(name);
	}
	//查询个数
	@Test
	public void demo05() {
		 Long count = jdbcTemplate.queryForObject("select count(*) from account",Long.class);
		 System.out.println(count);
	}
	//封装到对象中
	@Test
	public void demo06() {
		Account account = jdbcTemplate.queryForObject("select * from account where id=?",new MyRowMapper() ,5);
		System.out.println(account);
	}
	//查询多条记录
	@Test
	public void demo07() {
		List<Account> list = jdbcTemplate.query("select * from account ", new MyRowMapper());
		for(Account account:list) {
			System.out.println(account);
		}
	}
	class MyRowMapper implements RowMapper<Account>{

		@Override
		public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
			Account account = new Account();
			account.setId(rs.getInt("id"));
			account.setName(rs.getString("name"));
			account.setMoney(rs.getDouble("money"));
			return account;
		}
		
	}
}
