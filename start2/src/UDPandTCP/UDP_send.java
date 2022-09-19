package UDPandTCP;
import java.io.IOException;import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
public class UDP_send {  //先receive再send
    public static void main(String[] args) throws IOException {
        //DatagramSocket(int port) 构造数据包套接字并将其绑定到本地主机上的任何可用接口
        DatagramSocket ds= new DatagramSocket();
        //创建数据，并把数据打包：DatagramPacket(byte[] buf,int length,InetAddress address,int port)
        //构造一个数据包，发送长度为length的数据包发送到指定主机上的指定端口号
        byte[] bys ="BUPT_daonan55_UDP".getBytes();
//        int length=bys.length;
//        InetAddress address2 = InetAddress.getByName("192.168.2.11");
//        int port =10086;
//        DatagramPacket dp =new DatagramPacket(bys,length,address2,port);//太麻烦力
        DatagramPacket dp=new DatagramPacket(bys,bys.length, InetAddress.getByName("192.168.2.11"),10086);
        //调用DataGramSocket对象的方法发送数据:void send(DatagramSocket p)从此套接字发送数据包
        ds.send(dp);
        //void close() 关闭发送端
        ds.close();
    }
}
