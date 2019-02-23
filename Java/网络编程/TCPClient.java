package Net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建发送端Socket对象（创建连接）
        Socket s = new Socket(InetAddress.getByName("129GX69J2720UU6"),9999);
        //获取输出流对象
        OutputStream os = s.getOutputStream();
        //发送数据
        String str = "hello tcp,i'm coming!!";
        os.write(str.getBytes());
        //获取输入流对象
        InputStream is = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = is.read(bys);
        System.out.println(new String(bys,0,len));
        //释放资源
        os.close();
        s.close();
    }
}
