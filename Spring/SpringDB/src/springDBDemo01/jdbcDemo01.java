package springDBDemo01;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/*
 * JDBC模板的使用
 */
public class jdbcDemo01 {
	@Test
	public void demo01() {
		//创建数据库连接池
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql:///springdb01");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		//创建JDBC模板
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		jdbcTemplate.update("insert into account values(null,?,?)","david",100d);
	}
}
