package Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

//DatagramSocket：基于UDP协议
public class UDPSend {
    public static void main(String[] args) throws Exception{
        //创建socket对象
        DatagramSocket ds = new DatagramSocket();
        //创建数据并打包
        //创建数据
        String s = "hello UDP,i'm coming!";
        byte[] bys = s.getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("129GX69J2720UU6");
        int port = 8888;
        //打包
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        //发送数据
        ds.send(dp);
        //释放资源
        ds.close();
    }
}
