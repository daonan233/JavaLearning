package UDPandTCP;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
public class UDP_receive {
    public static void main(String[] args) throws IOException {
        //创建接收端的Socket对象（DatagramSocket）
        //DatagramSocket(int port)构造数据包套接字并将其绑定到本地主机上的指定接口
        DatagramSocket ds2=new DatagramSocket(10086);
        //创建一个数据包，用于接受数据
        //DatagramSocket(byte[] buf,int length) 构造一个DatagramPacket用于接收长度为length的数据包
        byte[] bys2 =new byte[1024];
        DatagramPacket dp2=new DatagramPacket(bys2,bys2.length);

        //调用DatagramSocket对象的方法接收数据
        ds2.receive(dp2);
        //解析数据包，并把数据在控制台显示
        //byte[] get data()返回数据缓冲区
        byte[] datas = dp2.getData();
        String dataString =new String (datas);
        System.out.println("数据是:"+dataString);
        //关闭接收端
        ds2.close();
    }

}
