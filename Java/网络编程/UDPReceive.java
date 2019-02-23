package Net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPReceive {
    public static void main(String[] args)throws Exception{
        //创建接收端socket对象
        DatagramSocket ds = new DatagramSocket(8888);
        //接受数据
        byte[] bys = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bys,bys.length);
        ds.receive(dp);
        //解析数据
        InetAddress address = dp.getAddress();
        byte[] data = dp.getData();
        int length = dp.getLength();
        System.out.println("sender - - - > " + address.getHostAddress());
        System.out.println(new String(data,0,length));
        //释放资源
        ds.close();
    }
}
