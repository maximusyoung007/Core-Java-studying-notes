package Net;

import java.net.InetAddress;
import java.net.UnknownHostException;
public class InetAddressDemo {
    public static void main(String[] args) {
        try{
            //InetAddress address = InetAddress.getByName("129GX69J2720UU6");
            InetAddress address = InetAddress.getByName("192.168.56.1");
            System.out.println(address);//129GX69J2720UU6/192.168.56.1
            String hostAddress = address.getHostAddress();
            String hostName = address.getHostName();
            System.out.println(hostAddress);
            System.out.println(hostName);
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}
