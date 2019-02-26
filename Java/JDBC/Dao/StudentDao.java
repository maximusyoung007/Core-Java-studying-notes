package Dao;

public interface StudentDao {
	void findAll();
	void login(String username,String password);
	void insert(String name,String password);
	void delete(int id);
	void update(int id,String name);
}
