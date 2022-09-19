package UDPandTCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_receive {//先运行receive，再运行send
    public static void main(String[] args) throws IOException {
        //创建服务器端的Socket()对象（SeverSocket）
        //ServerSocket(int port)创建绑定到指定端口的服务器套接字（socket）
        ServerSocket ss= new ServerSocket(12345);

        //Socket accept()侦听要链接到此套接字并接受他
        Socket s=ss.accept();
        //获取输入流，读数据，并把数据显示在控制台
       InputStream is =s.getInputStream();
       byte[] bys =new byte[1024];
       int len =is.read(bys);
       String data=new String(bys,0,len);
        System.out.println("数据是"+data);

        //释放资源
        s.close();
        ss.close();

    }
}
