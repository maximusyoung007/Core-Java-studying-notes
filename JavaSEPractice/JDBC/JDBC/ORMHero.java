package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



/*
 * 根据ORM的思想，设计其他几个常见的ORM方法：
 * 把一个Hero对象插入到数据库中
 * public static void add(Hero h)  
 
 * 把这个Hero对象对应的数据删除掉
 * public static void delete(Hero h)  
 
 * 更新这条Hero对象
 * public static void update(Hero h) 
 
 * 把所有的Hero数据查询出来，转换为Hero对象后，放在一个集合中返回
 * public static List<Hero> list();  
 */
public class ORMHero {
	//获取数据
    public static Hero get(int id) {
        Hero hero = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8","root", "123456");
            Statement s = c.createStatement();) {
 
            String sql = "select * from hero where id = " + id;
   
            ResultSet rs = s.executeQuery(sql);
   
            // 因为id是唯一的，ResultSet最多只能有一条记录
            // 所以使用if代替while
            if (rs.next()) {
                hero = new Hero();
                String name = rs.getString(2);
                int hp = rs.getInt("hp");
                int damage = rs.getInt(4);
                hero.name = name;
                hero.hp = hp;
                hero.damage = damage;
                hero.id = id;
            }
   
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return hero;
    }
    
    //插入数据
    public static void add(Hero h) {
    	try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8","root", "123456");
            Statement s = c.createStatement();) {
        	String sql = "insert into hero values(null," + "'" + h.name + "'," + h.hp + "," + h.damage + ");";
        	s.execute(sql);
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
    
    //删除数据
    public static void delete(Hero h) {
    	try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8","root", "123456");
            Statement s = c.createStatement();) {
        	String sql = "delete from hero where id=" + h.id + ";";
        	s.execute(sql);
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
    
    //更新数据
    public static void update(Hero h) {
    	try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8","root", "123456");
            Statement s = c.createStatement();) {
        	String sql = "update hero set name='" + h.name + "' where id=" + h.id + ";";
        	s.execute(sql);
        }catch(SQLException e) {
        	e.printStackTrace();
        }
    }
    
    //将所有的Hero数据查询出来放到集合中
    public static List<Hero> list(){
    	List<Hero> list = new ArrayList<Hero>();
    	try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fourtwothree?characterEncoding=UTF-8","root", "123456");
            Statement s = c.createStatement();) {
        	String sql = "select * from hero;";
            ResultSet rs = s.executeQuery(sql);
            while(rs.next()) {
            	//每次都应该重新创建一个新的对象，因此不能将创建对象的语句放到循环外面
            	Hero h = new Hero();
            	int id = rs.getInt(1);
            	String name = rs.getString(2);
            	int hp = rs.getInt(3);
            	int damage = rs.getInt(4);
            	h.id = id;
            	h.name = name;
            	h.hp = hp;
            	h.damage = damage;
            	list.add(h);
            }
        }catch(SQLException e) {
        	e.printStackTrace();
        }
        return list;
    }
	
    public static void main(String[] args) {
		Hero get = get(20439);
		System.out.println(get.name);
		Hero add = new Hero();
		add.name = "appleTree";
		add.hp = 500;
		add.damage = 500;
		add(add);
		Hero delete = new Hero();
		delete.id = 20421;
		delete(delete);
		Hero update = new Hero();
		update.name = "hello kitty";
		update.id = 20442;
		update(update);
		List<Hero> result = new ArrayList<Hero>();
		result = list();
		for(Hero h : result) {
			System.out.println(h.id + " " + h.name + " " + h.hp + " " + h.damage);
		}
	}
}
