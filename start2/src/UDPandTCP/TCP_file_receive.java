package UDPandTCP;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_file_receive {
    public static void main(String[] args) throws IOException {
        //创建服务器Socket对象
        ServerSocket ss=new ServerSocket(12345);
        //监听客户端链接，返回一个对应的Socket对象
        Socket s=ss.accept();
        //接收数据
        BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
        //把数据写入文本文件
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\javaCeshi\\javaCpoy.txt"));
        String line;
        while((line=br.readLine())!=null)
        {
            if("886".equals(line))
                break;
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        //给出反馈
        BufferedWriter bwServer =new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
        bwServer.write("文件上传成功");
        bwServer.newLine();
        bwServer.flush();

        //释放资源
        bw.close();
        br.close();

    }
}
