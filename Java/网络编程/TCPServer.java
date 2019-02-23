package Net;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.*;
public class TCPServer {
    public static void main(String[] args) throws Exception{
        //创建接收端Socket对象
        ServerSocket ss = new ServerSocket(9999);
        //监听
        Socket s = ss.accept();
        //获取输入流对象
        InputStream is = s.getInputStream();
        //获取数据
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        String str = new String(bys,0,len);
        //输出数据
        InetAddress address = s.getInetAddress();
        System.out.println("client:  - - -> " + address.getHostName());
        System.out.println(str);
        //转换数据
        String str2 = str.toUpperCase();
        //获取输入流对象
        OutputStream os = s.getOutputStream();
        //返回数据
        os.write(str2.getBytes());
        //释放资源
        s.close();
        //ss.close();
    }
}
