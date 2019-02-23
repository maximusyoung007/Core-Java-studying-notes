package Net;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

//模拟用户登录
public class TCPClient2 {
    public static void main(String[] args) throws IOException {
        //创建Socket对象
        //Socket s = new Socket(InetAddress.getByName("129GX69J2720UU6"),7777);
        Socket s = new Socket(("129GX69J2720UU6"),7777);
        //获取用户名和密码
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("please enter your username ");
        String userName = br.readLine();
        System.out.println("please enter your password");
        String passWord = br.readLine();
        //获取输出流对象
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        //写出数据
        out.println(userName);
        out.println(passWord);
        //获取输入流对象
       BufferedReader bf = new BufferedReader(new InputStreamReader(s.getInputStream()));
        //获取服务器返回的数据
        String result = bf.readLine();
        System.out.println(result);
        //释放资源
        out.close();
        bf.close();
        s.close();
    }
}
