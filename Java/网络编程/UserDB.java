package Net;

import java.util.ArrayList;
import java.util.List;

public class UserDB {
    private static List<User> users = new ArrayList<User>();
    static{
        users.add(new User("zhangsan","123456"));
        users.add(new User("lisi","654321"));
        users.add(new User("ling","ling"));
        users.add(new User("lisdsdadas","password"));
    }
    public static List<User> getUsers(){
        return users;
    }
}
