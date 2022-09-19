package UDPandTCP;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCP_send {
    public static void main(String[] args) throws IOException {
        //创建客户端的Socket对象
        //Socket(InetAddress address,int port)创建流套接字并将其连接到指定IP地址的指定端口号
        Socket s=new Socket(InetAddress.getByName("192.168.2.11"),12345);
        //Socket s2=new Socket("192.168.2.11",12345);这么写就可以了

        //获取输出流，写数据
        //OutputStream getOutputStream()返回此套接字的输出流
        OutputStream os=s.getOutputStream();
        os.write("hello tcp".getBytes());

        s.close();

    }
}
