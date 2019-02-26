package JDBCTest;

import org.junit.Test;

import Dao.StudentDao;
import DaoImpl.StudentDaoImpl;

public class TestStudentDao {
	@Test
	public void testFindAll() {
		StudentDao dao = new StudentDaoImpl();
		dao.findAll();
	}
	@Test
	public void testLogin() {
		StudentDao dao = new StudentDaoImpl();
		dao.login("sading","1100");
	}
	/*@Test
	public void testInsert() {
		StudentDao dao = new StudentDaoImpl();
		dao.insert("anna", "123456");
	}*/
	
	@Test
	public void testDelete() {
		StudentDao dao = new StudentDaoImpl();
		dao.delete(3);
	}
	@Test
	public void testUpdate() {
		StudentDao dao = new StudentDaoImpl();
		dao.update(2, "cat");
	}
	
}
