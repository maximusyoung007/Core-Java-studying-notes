package Net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.List;

//模拟用户登录
public class TCPServer2 {
    public static void main(String[] args) throws IOException {
        //创建服务器端Socket对象
        ServerSocket ss = new ServerSocket(7777);
        //监听
        Socket s = ss.accept();
        //获取输入流对象
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //获取用户名和密码
        String userName = br.readLine();
        String passWord = br.readLine();
        //判断用户名和密码是否正确
        boolean flag = false;
        /*if("129GX69J2720UU6".equals(userName) && "123456".equals(passWord))
            flag = true;
            */
        List<User> users = UserDB.getUsers();
        User user = new User(userName,passWord);
        if(users.contains(user))
            flag = true;
        //获取输出流对象
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        //返回判断信息
        if(flag)
            out.println("登陆成功");
        else
            out.println("登录失败");
        //释放资源
        s.close();
    }
}
