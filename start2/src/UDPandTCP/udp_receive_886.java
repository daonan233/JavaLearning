package UDPandTCP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class udp_receive_886 {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds=new DatagramSocket(12345);
       while(true)
       {
        byte[] bys =new byte[1024];
        DatagramPacket dp=new DatagramPacket(bys,bys.length);
        ds.receive(dp);
        System.out.println("数据是"+new String (dp.getData(),0,dp.getLength()));
       }

    }
}
